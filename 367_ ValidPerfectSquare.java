class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1){
            return true;
        }
        long low = 1 , high = num / 2 ;
        while(low <= high){
            long mid = low + (high - low)/2;
            long square = mid * mid ;
            if(square == num){
                return true;
            }else if(square > num){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return false;
    }
}