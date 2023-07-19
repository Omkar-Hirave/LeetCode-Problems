class Solution {
    public int sumOfSquares(int[] nums) {
        int N = nums.length;
        int result = 0 ;
        for(int i = 0 ; i < N  ; i++){
            if(N % (i + 1) == 0){
                result = result + (nums[i] * nums[i]) ;   
            }
        }
        return result;
    }
}