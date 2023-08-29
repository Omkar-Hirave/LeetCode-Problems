class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int low = 0 , high = n - 1;
        while(low < high){
            if(nums[low] % 2 == 0){
                low++;
            }else if(nums[high] % 2 == 0){
                swap(nums , low , high);
                low++;
                high--;
            }else{
                high--;
            }
        }
        return nums;
    }
    public void swap(int nums[] , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}