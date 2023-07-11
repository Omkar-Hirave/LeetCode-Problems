class Solution {
    public int[][] generateMatrix(int n) {
        int [][] matrix = new int[n][n];
        int columnBegin = 0 , columnEnd = n - 1;
        int rowBegin = 0 , rowEnd = n - 1;
        int count = 1 ;
        while(rowBegin <= rowEnd){
            for(int i = columnBegin ; i <= columnEnd ; i++){
            matrix[rowBegin][i] = count;
            count++;
            }
            rowBegin++;
            for(int i = rowBegin ; i <= rowEnd ; i++){
                matrix[i][columnEnd] = count;
                count++;
            }
            columnEnd--;
            for(int i = columnEnd ; i >= columnBegin ; i--){
                matrix[rowEnd][i] = count;
                count++;
            }
            rowEnd--;
            for(int i = rowEnd ; i >= rowBegin ; i--){
                matrix[i][columnBegin] = count;
                count++;
            }
            columnBegin++;
            }       
        return matrix;        
    }
}