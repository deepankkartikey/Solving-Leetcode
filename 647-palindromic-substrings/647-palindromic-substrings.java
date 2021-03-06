class Solution {
    public int countSubstrings(String s) {
        if(s.length()==0)
            return 0;
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int res=0;
        
        // BASE CASE-1: Length=1 ==> Always a palindrome
        for(int i=0; i<n; i++){
            dp[i][i] = true;
            res++;
        }
        
        // BASE CASE-2: Length=2 ==> i, i+1 are equal ==> Palindrome
        for(int i=0; i<n-1; i++){
            dp[i][i+1] = s.charAt(i)==s.charAt(i+1);
            if(dp[i][i+1])
                res++;
        }
        
        // Length > 2 : char[start]==char[end] && dp[i+1][j-1]==true, then current string is palindrome
        for(int len=3; len<=n; len++){
            for(int i=0, j=i+len-1; j<n; i++,j++){
                dp[i][j] = s.charAt(i)==s.charAt(j) && dp[i+1][j-1];
                if(dp[i][j])
                    res++;
            }
        }
        return res;
    }
}