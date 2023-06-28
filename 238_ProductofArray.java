class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int leftProduct = 1;
        for(int i = 1 ; i < nums.length ; i++){
            leftProduct = leftProduct * nums[i-1];
            result[i] = leftProduct;
        }
        int rightProduct = 1 ;
        result[0] = 1;
        for(int i = nums.length-1 ; i >= 0 ; i--){
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        return result ;
    }    
}
