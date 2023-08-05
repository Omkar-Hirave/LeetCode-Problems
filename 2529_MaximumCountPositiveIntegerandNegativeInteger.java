class Solution {
    public int maximumCount(int[] nums) {
        int positiveCount = findPositive(nums);
        int negativeCount = findNegative(nums);  
        return Math.max(positiveCount, negativeCount);
    }
    public int findNegative(int[] nums) {
        int low = 0, high = nums.length - 1;
        int searchIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < 0) {
                searchIndex = mid;
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }
        return searchIndex + 1;
    }
   public int findPositive(int[] nums) {
        int low = 0, high = nums.length - 1;
        int searchIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= 0) {
                searchIndex = mid;
                low = mid + 1;                
            } else {

                high = mid - 1; 

            }
        }
		return nums.length - (searchIndex + 1);
    }
}
