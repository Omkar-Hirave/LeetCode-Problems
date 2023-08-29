class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 1) return 1;
        int count = 1 , max = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] > nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(count , max);
        }
        return max;
    }
}