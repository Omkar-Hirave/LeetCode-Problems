class Solution {
    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }return reverse(matrix);
    }
    public static int[][] reverse(int [][] matrix){
        for(int i = 0 ; i < matrix.length ; i++){
            int  left = 0 ;
            int right = matrix.length-1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }   
        }
        return matrix;
    }
}
