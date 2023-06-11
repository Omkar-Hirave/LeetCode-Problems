function nextPermutation(nums){
    let breakpoint = -1 
    // [1 ,4 , 3 ,2]
    for(let i = nums.length-2 ; i >=0 ; i--){
        if(nums[i] < nums[i+1]){
            breakpoint = i 
            break
        }
    }
    if(breakpoint !== -1){
        for(let j = nums.length-1 ; j > breakpoint ; j--){
            if(nums[j] > nums[breakpoint]){
                let nextGreaterElement = j 
                let temp = nums[breakpoint]
                nums[breakpoint] = nums[nextGreaterElement]
                nums[nextGreaterElement] = temp
                break
            }
        }
        let suffix = nums.splice(breakpoint+1)
        suffix.reverse()
        nums.push(...suffix)
    }
}
nums = [2, 1, 3, 4] 
console.log("Array before ",nums);
nextPermutation(nums);
console.log("Array after ",nums);
