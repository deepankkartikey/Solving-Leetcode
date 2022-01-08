class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int start = 0, end = rows;
        while(start <= end){
            int mid = start + (end-start)/2;
            // find max element in current row and return index
            int maxColIdx = findMaxInRow(mat[mid]);
            // check neighbor rows' elements, for peak conditions
            // first row conditions
            if(mid == 0 && mat[mid][maxColIdx] > mat[mid+1][maxColIdx])
                return new int[]{mid, maxColIdx};
                
            // last row conditions
            if(mid == rows-1 && mat[mid][maxColIdx] > mat[mid-1][maxColIdx])
                return new int[]{mid, maxColIdx};
            
            // if peak element found
            if(mat[mid][maxColIdx] > mat[mid-1][maxColIdx] && mat[mid][maxColIdx] > mat[mid+1][maxColIdx])
                return new int[]{mid, maxColIdx};
            
            // if not peak, move up if previous row element is greater
            if(mat[mid][maxColIdx] < mat[mid-1][maxColIdx])
                end = mid-1;
            else
            // move down if next row element is greater
                start = mid+1;   
        }
        return new int[]{-1,-1};
    }
        
        int findMaxInRow(int[] row){
            int maxColIdx = 0;
            for(int i=1; i<row.length; i++)
                if(row[i] > row[maxColIdx])
                    maxColIdx = i;
            
            return maxColIdx;
        }
}