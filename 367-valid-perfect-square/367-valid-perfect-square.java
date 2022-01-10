class Solution {
    public boolean isPerfectSquare(int num) {
        // binary search
        // start,end and mid pointers
        long start = 1, end = num;
        while(start <= end){
            long mid = start + (end-start)/2;
            // if square of current mid is more than target, move to first part
            if(num < mid*mid)
                end = mid-1;
            // if square of current mid is less than target, move to second part
            else if(num > mid*mid)
                    start = mid+1;
            // if sqaure of mid equal to num, answer found
            else 
                return true;
        }
        return false;
    }
}