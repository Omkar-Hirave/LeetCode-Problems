class Solution {
    public int maxProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int maxProduct = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] >= largest){
                secondLargest = largest;
                largest = nums[i];
            }else if(nums[i] <= largest && nums[i] >= secondLargest){
                secondLargest = nums[i];
            }
        }
        maxProduct = (secondLargest - 1) * (largest - 1);
        return maxProduct;
    }
}
