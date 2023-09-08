class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0 , sum = 0 ;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , 1);
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            int remainder = (sum % k + k ) % k;
            if(map.containsKey(remainder)){
                count+= map.get(remainder);
                map.put(remainder , map.get(remainder)+1);
            }else{
                map.put(remainder , 1);
            }
        }
        return count;
    }
}
