class Solution {
    private Long[][][] dp = null;
    
    private long dfs(int m, int n, int maxMove, int r, int c){
        if(r<0 || r>=m || c<0 || c>=n)
            return 1;
        if(maxMove <= 0)
            return 0;
        if(dp[r][c][maxMove] != null)
            return dp[r][c][maxMove];
        
        long res = 0;
        long leftStep = dfs(m, n, maxMove-1, r, c-1);
        long rightStep = dfs(m, n, maxMove-1, r, c+1);
        long upStep = dfs(m, n, maxMove-1, r-1, c);
        long downStep = dfs(m, n, maxMove-1, r+1, c);
        res = (leftStep + rightStep + upStep + downStep)%1000000007L;
        dp[r][c][maxMove] = res;
        return res;
    }
    
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new Long[m+1][n+1][maxMove+1];
        return (int)dfs(m, n, maxMove, startRow, startColumn);
    }
}