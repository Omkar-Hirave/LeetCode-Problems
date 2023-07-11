class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length - 1;
        int i = 0;
        while(i < row && column >= 0){
            if(matrix[i][column] == target){
                return true;
            }else if (target > matrix[i][column]){
                i++;
            }else{
                column--;
            }
        }
        return false;
    }
}