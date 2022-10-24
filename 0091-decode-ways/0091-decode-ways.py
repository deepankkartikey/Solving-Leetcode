class Solution(object):
    def numDecodings(self, s):
        """
        :type s: str
        :rtype: int
        """
        N = len(s)+1
        dp = [0]*N
        
        dp[0] = 1
        
        dp[1] = 0 if s[0]=='0' else 1
        
        for i in range(2, len(s)+1):
            oneDigit = int(s[i-1:i])
            twoDigit = int(s[i-2:i])
            
            if oneDigit>=1:
                dp[i] = dp[i]+dp[i-1]
            
            if 10 <= twoDigit <= 26:
                dp[i] = dp[i]+dp[i-2]
        
        return dp[len(s)] 
            
