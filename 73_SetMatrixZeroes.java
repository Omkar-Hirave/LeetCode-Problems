class Solution {
    public void setZeroes(int[][] matrix) {
       boolean firstCol = false , firstRow = false;
       int i = 0 , j = 0 ;
       for(i = 0 ; i < matrix.length ; i++){
           for( j = 0 ; j < matrix[0].length ; j++){
               if(matrix[i][j] == 0){
                   if(i == 0 ) firstRow = true;
                   if(j == 0 ) firstCol = true;
                   matrix[i][0] = 0;
                   matrix[0][j] = 0;
               }
           }
       }
       for(i = 1 ; i < matrix.length ;i++){
           for(j = 1 ; j < matrix[0].length ; j++){
               if(matrix[i][0] == 0 || matrix[0][j] == 0){
                   matrix[i][j] = 0;
               }
           }
        }
        if(firstRow){
            for( i = 0 ; i < matrix[0].length ; i++)
                matrix[0][i] = 0;
        }
        if(firstCol){
            for(j = 0 ; j < matrix.length ; j++)
                matrix[j][0] = 0;
        }
    }
}
