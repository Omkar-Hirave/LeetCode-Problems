class Solution {
    public int trailingZeroes(int n) {
        int powOf5 = 5 , res = 0 ;
        while(n  >= powOf5){
            res = res + (n / powOf5);
            powOf5 = powOf5 * 5;
        }
        return res;
    }
}