class Solution {
    public int mySqrt(int x) {
        // special case
        if(x <= 0)
            return 0;
        int l = 1, r = x, ans = 1;
        // search for sqrt(x) using binary search in range [0, x]
        while(l < r){
            int mid = l + (r-l)/2;
            // if current num square is greater than x, answer lies in left part
            if(mid > x/mid)
                    r = mid;
            // if current num square is less than x, answer lies in right part
            else{
                ans = mid; // keep track of possible answer
                l = mid+1;
            }    
        }
        return ans;
    }
}