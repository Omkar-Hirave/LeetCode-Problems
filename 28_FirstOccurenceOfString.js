function strStr(hayStack,needle){
    let i = 0 , j = 0 
    if(needle === '') return 0 
    while(i < hayStack.length){
        if(hayStack[i] === needle[j]){
            i++
            j++
            if(j === needle.length){
                return i - j  
            }
        }
        else{
            i = i - j + 1 
            j = 0
        }
    }
    return -1
}
hayStack = 'omkarhihirave'
needle = 'hirave'
console.log(strStr(hayStack,needle))