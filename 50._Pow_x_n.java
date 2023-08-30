class Solution {
    public double myPow(double x, int n) {
        long N = n ;
        if(N < 0){
            x = 1 / x ;
            N = -N;
        }
        double currentProduct = x;
        double result = 1;
        long i = N;
        while(i > 0){
            if(i % 2 == 1){
                result = result * currentProduct;
            }
            currentProduct = currentProduct * currentProduct;
            i = i / 2;
        }
        return result;
    }
}
