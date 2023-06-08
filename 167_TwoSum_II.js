function twoSum(numbers,target){
    let left = 0 
    let right = numbers.length-1
    while(left < right){
        const twoSum = numbers[left] + numbers[right]
        if(twoSum > target){
            right--
        }else if (twoSum < target){
            left--
        }else{
            return [left+1 , right+1]
        }
    }
}
numbers = [2,3,4], target = 6
console.log(twoSum(numbers,target));