class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chars = new char[indices.length];
        for(int i = 0 ; i < s.length() ; i++){
            chars[indices[i]] = s.charAt(i);
        }
        return String.valueOf(chars);
    }
}