class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0 , n = s.length();
        while(i < n){
            if(stack.isEmpty() || stack.peek() != s.charAt(i)){
                stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0 , stack.pop());
        }
        return sb.toString();
    }
}