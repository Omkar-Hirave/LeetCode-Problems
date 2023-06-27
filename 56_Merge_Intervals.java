class Solution {
    int[][] merge(int[][] intervals) {
       if(intervals.length <=1){
           return intervals;
       }

       Arrays.sort(intervals , Comparator.comparingInt(interval -> interval[0]));
      

       List<int[]> mergedIntervals = new ArrayList<>();

       int[] previousInterval = intervals[0];
       mergedIntervals.add(previousInterval);

       for(int i = 1 ; i < intervals.length ;i++){
           int[] currentInterval = intervals[i];
           int previousStart = previousInterval[0];
           int previousEnd = previousInterval[1];
           int currentStart = currentInterval[0];
           int currentEnd =  currentInterval[1];
           if(currentStart <= previousEnd){
               previousInterval[1] = Math.max(currentEnd , previousEnd);
           }
           else{
               previousInterval = currentInterval;
               mergedIntervals.add(previousInterval);
           }
       }
       return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
