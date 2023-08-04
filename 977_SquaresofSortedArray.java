class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0 , right = nums.length-1 , index = nums.length-1;
        while(left <= right){
            int leftSum = nums[left] * nums[left];
            int rightSum = nums[right] * nums[right];
            if(leftSum < rightSum){
                result[index] = rightSum;
                right--;
            }else{
                result[index] = leftSum ;
                left++; 
            }
            index--;
        }

        return result;
    }
}