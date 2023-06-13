function moveZeroes(nums){
    let nonZero = 0 
    for(let i = 0 ; i < nums.length ; i++){
        if(nums[i] !== 0){
            let temp = nums[i]
            nums[i] = nums[nonZero]
            nums[nonZero] = temp
            nonZero++
        }
    }
}
nums = [0,1,0,3,12]
console.log("Array before sorting..",nums);
moveZeroes(nums)
console.log("Array After sorting..",nums);