class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        // goal is to minimize the search space
        // lower bound for search space = 1st row
        // upper bound for search space = last column
        // we should always select an element s.t. we have two options,
        // 1. either we see a bigger element
        // 2. Or we see a smaller element when we move in 2 directions
        int row = 0, col = n-1;
        while(row < m && col >= 0){
            // current element is less than target,
            // move towards bigger element
            // move to next row
            if(matrix[row][col] < target)
                row++;
            // current element smaller than target,
            // move towards smaller element
            // move to previous column
            else if(matrix[row][col] > target)
                    col--;
            else
                return true;
        }
        return false;
    }
}