/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = findPeakIndex(mountainArr);
        int start=0, end=mountainArr.length()-1;
        int asc = search(target, start, peakIndex, mountainArr);
        if(asc == -1){
            int desc = searchInDesc(target, peakIndex+1, end, mountainArr);
            return desc;
        }
        return asc;   
    }
    
    int findPeakIndex(MountainArray mountainArr){
        int st = 0, e = mountainArr.length()-1;
        while(st < e){
            int mid = st + (e-st)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1))
                e = mid;
            else if(mountainArr.get(mid) < mountainArr.get(mid+1))
                    st = mid+1;
        }
        return st;
    }
    
    int search(int trgt,int st, int e, MountainArray mountainArr){
        while(st <= e){
            int mid = st + (e-st)/2;
            if(mountainArr.get(mid) > trgt)
                e = mid-1;
            else if(mountainArr.get(mid) < trgt)
                    st = mid+1;
            else
                return mid;
        }
        return -1;
    }
    
    int searchInDesc(int trgt, int st, int e, MountainArray mountainArr){
        while(st <= e){
            int mid = st + (e-st)/2;
            if(mountainArr.get(mid) > trgt)
                st = mid+1;
            else if(mountainArr.get(mid) < trgt)
                    e = mid-1;
            else
                return mid;
        }
        return -1;
    }
}