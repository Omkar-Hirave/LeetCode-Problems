function romanToInt(s){
    const romanDict = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
      }
      let total = 0 , prev = 0 
//       Start from the end of the string 
      for(let i = s.length-1 ; i >= 0 ; i--){
//         access time for dictionary is O(1) so we are looking into the dictionary with the value at the i'th position 
        const curr = romanDict[s.charAt(i)]
        if(curr < prev){
            total = total - curr
        }else{
            total = total + curr
        }
//         initialize prev with curr value to use as prev for the next loop 
        prev = curr 
      }
      return total
}

s = "MCMXCIV"
console.log(romanToInt(s))
