function isPalindrome(s){
//     convert string s to lowercase and replace all characters other than alphanumeric characters with ""(space)
    s = s.toLowerCase().replace(/[^a-z0-9]/g,"")
//   initialize the left and right pointer 
  let left = 0 , right = s.length-1
//   check until left is smaller than right 
  while(left < right){
//     If left and right doesnt match everytime its not a palindrome  
  if (s[left] !== s[right]){
    return false 
  }
    // increment left pointer and decrement right pointer after every comparison 
    left++
    right--
  }
    return true 
  }
 
  s = "A man, a plan, a canal: Panama"
  console.log(isPalindrome(s))
