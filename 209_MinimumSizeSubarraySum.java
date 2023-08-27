class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int start = 0 , end = 0 , count = Integer.MAX_VALUE;
       int currentSum = 0 , n = nums.length;
       while(end < n){
           while(currentSum < target && end < n){
               currentSum += nums[end];
               end++;
           }
           while(currentSum >= target && start < n){
               if(count > (end - start)){
                   count = end - start;
               }
               currentSum -= nums[start];
               start++;
           }
       }
       if(count == Integer.MAX_VALUE){
           return 0;
       }
       return count;
    }
}