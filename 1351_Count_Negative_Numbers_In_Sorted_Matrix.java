class Solution {
    public int countNegatives(int[][] matrix) {
        int count = 0 , i = 0 , column = matrix[0].length-1;
        while(i < matrix.length && column >= 0){
            int element = matrix[i][column];
            if(element < 0){
                count += matrix.length - i;
                column--;
            }else{
                i++;
            }
        }
        return count;
    }
}