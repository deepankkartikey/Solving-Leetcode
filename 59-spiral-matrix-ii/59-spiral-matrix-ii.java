class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int num = 1;
        int left = 0, right = n-1, top = 0, bottom = n-1;
        
        while(top <= bottom && left <= right){
            
            for(int j=left; j<=right; j++)
                res[top][j] = num++;
            top++;
            
            for(int i=top; i<=bottom; i++)
                res[i][right] = num++;
            right--;
            
            for(int j=right; j>=left; j--)
                res[bottom][j] = num++;
            bottom--;
            
            for(int i=bottom; i>=top; i--)
                res[i][left] = num++;
            left++;
        }
        return res;
    }
}