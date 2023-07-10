class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String concatenated = s + s;
        if(concatenated.contains(goal)){
            return true;
        }
        return false;
    }
}