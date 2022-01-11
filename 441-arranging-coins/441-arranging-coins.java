class Solution {
    public int arrangeCoins(int n) {
        // applying binary search
        // using long to accomodate sums which are out of integer range
        long start = 1, end = n;
        while(start <= end){
            long mid = start + (end-start)/2;
            // find sum of number of coins at current instant
            long sum = mid*(mid+1)/2;
            // if sum of number of coins is less than given coins,
            // move towards second part
            if(sum < n)
                start = mid+1;
            // if sum of number of coins is greater than given coins,
            // move to first part
            else if(sum > n)
                    end = mid-1;
            else
            // when sum of number of coins is equal to given coins
            // answer found
                return (int)mid;
        }
        return (int)end;
    }
}