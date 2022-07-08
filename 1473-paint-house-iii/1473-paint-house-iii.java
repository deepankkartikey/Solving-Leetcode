class Solution {
    private int[][][] dp = new int[100][21][101];
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        for(int[][] arr2: dp){
            for(int[] arr1: arr2){
                Arrays.fill(arr1, -1);
            }
        }
        int ans = help(0, 0, 0, houses, cost, m, n, target);
        return ans == Integer.MAX_VALUE/2 ? -1 : ans;
    }
    
    int help(int i, int prevColor, int neighbours, int[] houses, int[][] cost, int m, int n, int target){
        if(neighbours > target) return Integer.MAX_VALUE/2;
        if(i == m)
            return neighbours == target ? 0 : Integer.MAX_VALUE/2;
        
        if(dp[i][prevColor][neighbours] != -1)
            return dp[i][prevColor][neighbours];
        else {
            int ans = Integer.MAX_VALUE/2;
            if(houses[i] == 0)
                for(int j=0; j<n; j++)
                    ans = Math.min(ans, cost[i][j]+help(i+1,j+1,(prevColor==j+1)?neighbours:neighbours+1, houses, cost, m, n, target));
            else
                ans = Math.min(ans, help(i+1, houses[i], (houses[i]==prevColor)?neighbours:neighbours+1, houses, cost, m, n, target));
        return dp[i][prevColor][neighbours]=ans;
        }
    }
}