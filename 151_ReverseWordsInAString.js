function reverseWords(str){
    // Remove all the leading and trailing whitespaces the string might have
    str = str.trim()
    // Remove all the multiple whitespaces between the words , split the string into an array and store in the words array
    let words = str.split(/\s+/)
    //Now reverse each words in the words array using the reverse() method
    words.reverse()
    // add all the reversed words in the string with single whitespace character
    return words.join(' ')  
}

str = "the sky is blue"
console.log(reverseWords(str));