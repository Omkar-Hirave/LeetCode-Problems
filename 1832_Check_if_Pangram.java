class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for(int i = 0 ; i < sentence.length() ; i++){
            int ASCIIvalue = (int) sentence.charAt(i);
            freq[ASCIIvalue - (int) 'a']++;
        }
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] == 0){
                return false;
            }
        }return true;   
    }
}