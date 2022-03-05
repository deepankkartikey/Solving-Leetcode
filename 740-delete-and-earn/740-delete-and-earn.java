class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] freq = new int[10002];
        int[] dp = new int[10002];
        
        // create frequency array to store occurence of each element
        for(int num: nums){
            freq[num]++;
        }
        
        // create a dp array to store score and return max points
        // since numbers start from 1
        dp[0] = 0;
        
        // special case, first number has to be assigned points
        dp[1] = 1*freq[1];
        
        // There are 2 cases:
        // 1. When ith element is not picked in calculation of points,
        //    we keep (i-1)th score as one possibility
        // 2. When ith element is picked in calculation of points,
        //    we have to take (i-2)th element into consideration, as (i-1)th element cannot be considered
        // the result should be maximum of the 2 cases
        for(int i=2; i<10002; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+i*freq[i]);
        }
        // last element of dp array, stores final max score.
        return dp[10001];
    }
}