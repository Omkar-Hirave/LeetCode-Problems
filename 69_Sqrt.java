class Solution {
    public int mySqrt(int x) {
       int low = 0 , high = x ;
       int insertPosition = 0;
       while(low <= high){
           int mid = low + (high - low)/2;
           long square = (long)mid * mid;
           if(square <= x){
               insertPosition = mid ;
               low = mid + 1;
           }else{
               high = mid - 1;
           }
       }
       return insertPosition;
    }
}