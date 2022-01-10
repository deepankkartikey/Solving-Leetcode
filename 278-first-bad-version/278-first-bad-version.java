/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // apply binary search
        // find start, end and mid
        int start = 1, end = n;
        while(start < end){
            int mid = start + (end-start)/2;
            // if mid is NOT Bad version, answer in 2nd part
            if(!isBadVersion(mid))
                start = mid+1;
            // if mid is Bad version, can be possible answer, move left
            else 
                end = mid;
        }
        return end;
    }
}