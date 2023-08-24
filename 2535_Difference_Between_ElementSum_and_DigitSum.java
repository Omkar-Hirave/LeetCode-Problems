class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0 ,digitSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            elementSum += nums[i];
            int digit = nums[i];
            while(digit != 0){
                int remainder = digit % 10;
                digitSum += remainder;
                digit = digit/10;
            }
        }
    return Math.abs(digitSum - elementSum);
    }
}