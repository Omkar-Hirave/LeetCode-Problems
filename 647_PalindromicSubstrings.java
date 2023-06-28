class Solution {
    public int countSubstrings(String s) {
        int  count = 0;
       for(int i = 0 ; i < s.length() ; i++){
           int len1 = expandAroundCenter(s , i , i);// odd-sized string
           int len2 = expandAroundCenter(s , i , i+1);//even-sized string
           count = count + len1 + len2;
       }return count;
    }
    public int expandAroundCenter(String s ,int left ,int right){
        int count = 0 ; 
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count++;
    }
}