function LongestCommonPrefix(strs){
  //IF the string is empty(i.e.) its length is 0 return ''
    if (strs.length ===0 ) return ""
//     Take first string (i.e.flower)  to compare 
    let prefix = strs[0]
//     Run a loop from second string(i.e.first location) to the last string 
    for(let i = 1 ; i < strs.length ; i++)
    {
//         Check if all other strings with string at index position 0 
        while(strs[i].indexOf(prefix) !==0)
        {
//           reduce the size of prefix by 1 everytime its not matching
            prefix = prefix.substring(0,prefix.length - 1)
//           If there isnt any common substring return empty string ("")
            if (prefix === "") return ""
        }
    }
    return prefix 
}

const strs = ['apple','ape','app']

console.log(LongestCommonPrefix(strs))
