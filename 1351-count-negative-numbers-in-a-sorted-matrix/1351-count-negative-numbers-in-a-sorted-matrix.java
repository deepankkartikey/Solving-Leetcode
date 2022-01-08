class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        // check for special cases first
        for(int row=0; row<rows; row++){
            // if in current row, first element is negative, all elements are negative
            if(grid[row][0] < 0){
                count += cols;
                continue;
            }
            // if last element is positive, no elements are negative in current row
            if(grid[row][cols-1] >= 0)
                continue;
            
            // there is mix of +ve and -ve, find the boundary element
            int l=0, r=cols-1;
            // apply binary search for -ve element within row
            while(l <= r){
                int mid = l + (r-l)/2;
                if(grid[row][mid] < 0)
                    r = mid-1;
                else
                    l = mid+1;
            }
            // in end of binary search l will point to first -ve number
            // cols-l = total -ve elements in current row
            count += (cols-l);
        }
        return count;
    }
}