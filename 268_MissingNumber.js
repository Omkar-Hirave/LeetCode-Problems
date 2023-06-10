function missingNumber(nums){
    let ans = 0 
    let i = 0 
    for(i = 0 ; i < nums.length ; i++){
        ans = ans ^ (nums[i] ^ i )
    }return ans ^ i 
}