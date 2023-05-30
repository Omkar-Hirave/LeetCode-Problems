function containsDuplicates(nums){
    const newSet = new Set()
    for(let i = 0 ; i <nums.length ; i++ ){
        if(newSet.has(nums[i])){
            return true
        }
        newSet.add(nums[i])
    }
    return false
}
nums = [1,2,3,4]
console.log(containsDuplicates(nums))