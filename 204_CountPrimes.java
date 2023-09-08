class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] prime = new boolean[n+1];
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(prime[i] == false){
                for(int j = i * i ; j <= n ; j = j + i){
                    prime[j] = true;
                }
            }
        }
        for(int i = 2 ; i < n ; i++){
            if(!prime[i]){
                count++;
            }
        }
        return count;
    }
}
