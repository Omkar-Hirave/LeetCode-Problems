function maxProduct(nums){
  let maxProduct = nums[0]
  let leftProduct = 1 
  let rightProduct = 1 
  let left = 0 
  let right = nums.length-1
  let n = nums.length
  while(left < n && right >= 0){
    leftProduct = leftProduct * nums[left]
    rightProduct = rightProduct * nums[right]
    maxProduct = Math.max(maxProduct , leftProduct , rightProduct)

    if(nums[left] === 0 ){
      leftProduct = 1 
    }
    if(nums[right] === 0 ){
      rightProduct = 1
    }
    left++ 
    right--
  }return maxProduct
}
nums = [-2,0,-1]
console.log(maxProduct(nums));