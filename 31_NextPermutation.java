public class Solution {
    public void nextPermutation(int[] nums) {
        int breakpoint = - 1;
        for(int i = nums.length-2 ; i >= 0 ; i--){
            if(nums[i] < nums[i+1]){
                breakpoint = i;
                break;
            }
        }
        if(breakpoint != -1){
            int nextGreaterElement = -1;
            for(int j = nums.length-1 ; j >= 0 ; j--){
                if(nums[j] > nums[breakpoint]){
                    nextGreaterElement = j ;
                    break;
                }
            }
            int temp = nums[nextGreaterElement];
            nums[nextGreaterElement] = nums[breakpoint];
            nums[breakpoint] = temp;
        }
        
        int left = breakpoint + 1 , right = nums.length-1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
