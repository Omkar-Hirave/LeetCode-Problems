class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        int count = 0;
        int[] previousInterval = intervals[0];
        int previousEnd = previousInterval[1];

        for (int i = 1; i < intervals.length; i++) {
            int[] currentInterval = intervals[i];
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];

            if (currentStart < previousEnd) {
                // Overlap detected
                count++;
                previousEnd = Math.min(currentEnd, previousEnd);
            } else {
                // No overlap, update the previous interval
                previousInterval = currentInterval;
                previousEnd = currentEnd;
            }
        }
        return count;
    }
}