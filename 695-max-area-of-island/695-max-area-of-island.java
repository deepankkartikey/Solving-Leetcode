class Solution {
    
    boolean[][] seen;
    
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = Integer.MIN_VALUE;
        
        seen = new boolean[rows][cols];
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                maxArea = Math.max(maxArea, area(i, j, grid));
            }
        }
        return maxArea;
    }
    
    private int area(int row, int col, int[][] grid){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || seen[row][col]==true || (grid[row][col]==0))
            return 0;
        
        seen[row][col] = true;
        
        return(1 + area(row+1, col, grid) + area(row-1, col, grid) + area(row, col+1, grid) + area(row, col-1, grid));
    }
}