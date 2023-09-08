class Solution {
    public boolean halvesAreAlike(String s) {
            int left = 0 , right = s.length()-1;
            int leftSum = 0 , rightSum = 0;
            while(left < right){
                if(isVowel(s.charAt(left))){
                    leftSum++;
                }
                if(isVowel(s.charAt(right))){
                    rightSum++;
                }
                left++;
                right--;
            }
            return rightSum == leftSum;
        }
        public boolean isVowel(char c){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' 
            ){
                return true;
            }
            return false;
        }
    }