function removeDuplicates(nums){
    let count = 0 
    for(let i = 0 ; i < nums.length ; i++){
        if(i < 2 || nums[i] > nums[count - 2]){
            nums[count] = nums[i]
            count++
        }
    }
    return count
}
nums = [1,1,1,2,2,3]
console.log(removeDuplicates(nums))