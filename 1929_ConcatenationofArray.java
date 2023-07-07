class Solution {
    public int[] getConcatenation(int[] nums) {
       int n = nums.length;
       int[] concatArray = new int[n*2];
       for(int i = 0; i < n ; i++){
           concatArray[i] = nums[i];
           concatArray[n+i] = nums[i];
       }
       return concatArray;
    }
}