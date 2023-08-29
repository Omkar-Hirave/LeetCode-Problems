class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDifference = Integer.MAX_VALUE;
        int resultSum = nums[0] + nums[1] + nums[2];
        for(int i = 0 ; i < nums.length-2 ; i++){
            int left = i + 1 ;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target)
                    return sum ;
                else if(sum > target){
                    right--;
                }else{
                    left++;
                }
                int currentDifference = Math.abs(sum - target);
                if(minDifference > currentDifference){
                    minDifference = currentDifference;
                     resultSum = sum;
                }
            }
        }
        return resultSum;
  }
}