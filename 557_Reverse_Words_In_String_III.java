class Solution {
    public String reverseWords(String s) {
        int start = 0 ;
        char[] chars = s.toCharArray();
        for(int end = 0 ; end < s.length() ; end++){
            if(chars[end] == ' ' || end == s.length()-1){
                int left = start ; 
                int right = (end == s.length()-1) ? end : end - 1;
                while(left < right){
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
                start = end + 1;
            }
        }
        return new String(chars);
    }
}
