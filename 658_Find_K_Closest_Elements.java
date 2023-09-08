class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int left = 0 , right = nums.length-k;
        while(left < right){
            int mid = left + (right - left)/2;
            if(x - nums[mid] > nums[mid + k] - x){
                left = mid + 1 ;
            }else{
                right = mid;
            }
        }
        for(int i = left ; i < left + k ; i++){
            result.add(nums[i]);
        }
        return result;
    }  

}
