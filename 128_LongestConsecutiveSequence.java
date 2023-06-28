class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> set = new HashSet<>();
      for(int num : nums){
          set.add(num);
      }
      int max = 0 ;
      for(int i = 0 ; i < nums.length ; i++){
          if(!set.contains(nums[i]-1)){
              int currentNumber = nums[i];
              int length=1;
              while(set.contains(currentNumber+1)){
                  currentNumber++;
                  length++;
              }
              max = Math.max(length , max);
          }
      }return max;
    }
}
