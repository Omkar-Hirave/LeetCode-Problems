function searchInsert(nums , target){
    let low = 0 
    let high = nums.length -1 
    while(low <= high){
        let mid = Math.floor(low + (high - low)/2)
        if(nums[mid] === target){
            return mid
        }else if(nums[mid] < target){
            low = mid + 1 
        }else if(nums[mid] > target){
            high = mid - 1 
        }
    }
    return low 
}

const nums = [1, 3, 5, 6];
const target = 2;
const result = searchInsert(nums, target);
console.log(result);  // Output: 2