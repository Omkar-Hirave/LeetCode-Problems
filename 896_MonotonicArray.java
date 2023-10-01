class Solution {
    public boolean isMonotonic(int[] nums) {
        int count1 = 0 , count2 = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] <= nums[i-1]){
                count1++; 
            }
            if(nums[i] >= nums[i-1]){
                count2++;
            }
        }
        return (count1 == nums.length-1 || count2 == nums.length-1);        
    }
}