function maxArea(height){
    let left = 0 
    let right = height.length-1
    let maxArea = 0 
    while(left < right){
        const area = Math.min(height[left],height[right]) * (right-left)
        console.log('left ->',left,'right ->',right,'area ->',area)
        if(area > maxArea) {
            maxArea = area
        }
        if(height[left] < height[right]){
            left++
        }else{
            right--
        }
    }return maxArea
}
height = [1,8,6,2,5,4,8,3,7]
console.log(maxArea(height));