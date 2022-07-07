class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int a = s1.length();
        int b = s2.length();
        
        if(a+b != s3.length())
            return false;
        
        boolean[][] dp = new boolean[a+1][b+1];
        
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(i==0 && j==0)
                    dp[i][j] = true;
                else if(i==0)
                        dp[i][j] = s2.charAt(j-1)==s3.charAt(i+j-1) ? dp[i][j-1] : false;
                else if(j==0)
                        dp[i][j] = s1.charAt(i-1)==s3.charAt(i+j-1) ? dp[i-1][j] : false;
                else {
                    if(s1.charAt(i-1)==s3.charAt(i+j-1))
                        dp[i][j] = dp[i-1][j];
                    if(!dp[i][j] && s2.charAt(j-1)==s3.charAt(i+j-1))
                        dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}