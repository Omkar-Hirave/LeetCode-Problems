class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0 , max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 1){
                count++;
            }else{
                count = 0;
            }
            max = Math.max(count , max);
        }
        return max > 2;
    }
}