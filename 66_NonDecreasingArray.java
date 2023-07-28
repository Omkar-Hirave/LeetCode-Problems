public class Solution {
    public boolean checkPossibility(int[] nums) {
       int count = 0 ;
    //    best input to comprehend logic [3,4,2,5]
       for(int i = 1 ; i < nums.length ; i++){
           if(nums[i-1] > nums[i]){
               count++;
               if(count > 1 ) return false;
                //    [3,1,5] 
               if(i == 1 || nums[i] >= nums[i-2])
                   nums[i-1] = nums[i];
                //    [3,1,2] 
               else 
                   nums[i] = nums[i-1];
           }
       }
       return true;
    }
}
