function trap(height){
    let left = 0 
    let right = height.length-1 
    let leftMax = height[left]
    let rightMax = height[right]
    let total = 0 
    while(left < right){
        if(rightMax < leftMax){
            right--
            rightMax = Math.max(rightMax , height[right])
            total = total + (rightMax - height[right])
        }else{
            left++
            leftMax = Math.max(leftMax, height[left])
            total = total + (leftMax - height[left])
        }
    }return total 
}
height = [0,1,0,2,1,0,1,3,2,1,2,1]
console.log(trap(height))