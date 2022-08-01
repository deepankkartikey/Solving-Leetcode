class Solution {
    public int uniquePaths(int m, int n) {
        int N = m+n-2;
        int r = n-1;
        long res = 1;
        
        for(int i=1; i<=r; i++){
            res = res*(N-r+i)/i;
        }
        
        return (int)res;
    }
}