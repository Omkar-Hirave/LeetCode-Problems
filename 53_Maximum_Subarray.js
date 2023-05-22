function maxSubSum(nums){
    let currentSum = 0 
    let maxSum = 0 
    for(let i = 0 ; i < nums.length ; i++){
        currentSum = currentSum + nums[i]
        if(currentSum < 0 ){
            currentSum = 0 
        }
        if(currentSum > maxSum){
            maxSum = currentSum
        }
    }return maxSum
}
nums = [-2,1,-3,4,-1,2,1,-5,4]
console.log(maxSubSum(nums))