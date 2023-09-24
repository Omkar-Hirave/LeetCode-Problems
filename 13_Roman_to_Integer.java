class Solution{
    public int romanToInt(String s){
        HashMap<Character , Integer> romanDict = new HashMap<>();       
        romanDict.put('I',1);
        romanDict.put('V',5);
        romanDict.put('X',10);
        romanDict.put('L',50);
        romanDict.put('C',100);
        romanDict.put('D',500);
        romanDict.put('M',1000);
        int total = 0 , prev = 0;
        for(int i = s.length()-1 ; i >= 0 ; i--){
           int curr = romanDict.get(s.charAt(i));
           if(curr < prev){
              total = total - curr;
           }else{
              total = total + curr;
           }
           prev = curr;
        }
        return total;
    }
}