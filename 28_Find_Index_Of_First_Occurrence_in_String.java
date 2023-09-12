class Solution {
   public int strStr(String haystack, String needle) {
      int i = 0 , j = 0 ;
      while(i < haystack.length()){
         if(haystack.charAt(i) == needle.charAt(j)){
            i++;
            j++;
            if(j == needle.length()) return i - j;
         }else{
            j = 0 ;
            i = i - j + 1; 
         }
      }
      return -1;
   }
}