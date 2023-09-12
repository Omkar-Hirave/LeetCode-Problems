class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        // This problems has  O(1) space complexity since we can have only atmost 25 characters in the set  
        for(char ch : s.toCharArray()){
            if(set.contains(ch))
                return ch;
            set.add(ch);
        }
        return 'a';
    }
}