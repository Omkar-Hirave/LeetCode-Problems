class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap<>();
       for(int i = 0 ; i < strs.length ; i++){
           String word = strs[i];
           char[] chars = word.toCharArray();
           Arrays.sort(chars);
           String sortedWord = new String(chars);
           if(!map.containsKey(sortedWord)){
               map.put(sortedWord , new ArrayList<>());
           }
           map.get(sortedWord).add(word);
       }
       return new ArrayList<List<String>>(map.values());
    }
}
