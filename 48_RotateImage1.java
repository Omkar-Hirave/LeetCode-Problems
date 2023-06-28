class Solution {
    public void rotate(int[][] matrix) {
        int right=matrix.length-1, left=0;
        //neetcode solution video
        while(left<right){
            for(int i=0; i<right-left; i++){
                
                int top=left, bottom=right;
                //save top left
                int temp = matrix[top][left+i];
                //rotate bottom left to top left
                
                matrix[top][left+i]=matrix[bottom-i][left];
                //rotate bottom roght to bottom left
                
                matrix[bottom-i][left]=matrix[bottom][right-i];
                //rotate top right to bottom right
                
                matrix[bottom][right-i]=matrix[top+i][right];
                //save top left to top right
                matrix[top+i][right]=temp;   
            } 
            left++;
            right--;
        }
    }
}