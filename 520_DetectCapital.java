class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length(), upperCount = 0;
        
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) 
                upperCount++;
        }
        
        return upperCount == 0 || upperCount == n || (upperCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
