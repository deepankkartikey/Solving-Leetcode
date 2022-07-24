class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols-1;
        
        if(rows == 1 && cols == 1){
            if(matrix[0][0] != target)
                return false;
        }
        while(row >= 0 && row < rows && col >= 0 && col < cols ){
            if(matrix[row][col] > target)
                col--;
            else if(matrix[row][col] < target)
                    row++;
            else
                return true;
        }
        return false;
    }
}