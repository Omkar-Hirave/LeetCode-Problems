function jump(nums){
    let current = 0 
    let farthest = 0 
    let jumps = 0 
    for(let i = 0 ; i < nums.length -1; i++){
        farthest = Math.max(farthest,nums[i]+i)
        if(i === current){
            current = farthest
            jumps++
        }
        
    }
    return jumps
}
nums = [2,3,1,1,4]
console.log(jump(nums))