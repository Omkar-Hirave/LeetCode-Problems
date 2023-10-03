public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count[] = new int[101];
        int result = 0 ;
        for(int num : nums){
            result = result + count[num];
            count[num]++;
        }
        return result;
    }
}
