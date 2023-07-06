class Solution {
    public int firstUniqChar(String s){
        int[] freqArray = new int[26];
        char[] charArray = s.toCharArray();
        for(int i = 0 ; i < charArray.length ; i++){
            char c = charArray[i];
            freqArray[c - 'a']++;
        }
        for(int i = 0 ; i < charArray.length ; i++){
            char c = charArray[i];
            if(freqArray[c - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}