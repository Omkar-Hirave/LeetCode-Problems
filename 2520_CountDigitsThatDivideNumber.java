class Solution {
    public int countDigits(int num) {
        int count = 0 ;
        int x = num ;
        while(num != 0){
            int remainder = num % 10 ;
            if(x % remainder == 0){
                count++;
            }
            num = num / 10 ;
        }
        return count;
    }
}