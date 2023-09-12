class Solution {
    public int maxVowels(String s, int k) {
        int left = 0 , right = 0 , maxCount = 0 , window = 0 ;
        for(;right < k ; right++){
            window += isVowel(s.charAt(right));
        }
        maxCount = window;
        while(right < s.length()){
            window -= isVowel(s.charAt(left));
            left++;

            window += isVowel(s.charAt(right));
            right++;
            
            maxCount = Math.max(window , maxCount);
        }
        return maxCount;
    }
    public int isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0 ;
    }
}