class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        
        // number 0 has 0 1's in binary representation
        ans[0] = 0;
        
        // start with 1,
        for(int i=1; i<=n; i++){
            // if current number is even, number of 1's is same as number of 1's in its half
            if(i%2 == 0)
                ans[i] = ans[i/2];
            // if current number is odd, number of 1's is 1+number of 1's in its previous number
            else
                ans[i] = ans[i-1]+1;
        }
        return ans;
    }
}