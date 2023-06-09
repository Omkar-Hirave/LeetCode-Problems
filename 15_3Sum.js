function threeSum(nums){
  let result = [] 
  nums.sort((a,b)=>a-b)
  for(let i = 0 ; i < nums.length-2 ; i++){
    if(i > 0 && nums[i] === nums[i-1]){
        continue
    }
    let left = i + 1 
    let right = nums.length-1
    while(left < right){
        const sum = nums[left] + nums[right] + nums[i]
        if(sum < 0 ){
          left++
        }else if (sum > 0){
          right--
        }else{
          result.push([nums[i] , nums[left] , nums[right]])
          while(left < right && nums[left] === nums[left+1]){
            left++
          }
          while(left < right && nums[right] === nums[right-1]){
            right--
          }
          left++
          right--
        }
    }
  }return result 
}

nums = [-1,0,1,2,-1,-4]
console.log(threeSum(nums));