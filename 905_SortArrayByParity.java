class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[] = new int[nums.length];
        int k = 0 , l = nums.length-1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0){
                arr[k] = nums[i];
                k++;
            }else{
                arr[l] = nums[i];
                l--;
            }
        }
        return arr;
    }
}