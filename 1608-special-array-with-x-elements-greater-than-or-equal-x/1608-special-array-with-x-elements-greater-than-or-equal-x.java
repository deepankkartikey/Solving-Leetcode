class Solution {
    // find count of numbers >= at each index
    int count(int[] nums, int element){
        int c = 0;
        for(int num: nums)
            if(num >= element)
                c++;
        return c;
    }
        
    public int specialArray(int[] nums) {
        // apply binary search and look for answer
        // define search space
        // the least answer can be 1 when one element present and that is >= 1
        int start = 1;
        // the max in search space can be array length i.e. all elements are >= number of elements
        int end = nums.length;
        
        // apply binary search
        while(start <= end){
            int mid = start + (end-start)/2;
            int currentCount = count(nums, mid);
            // if currentCount of elements >= mid is less than mid ,answer lies in first part
            if(mid > currentCount)
                end = mid-1;
            else 
                // if currentCount of elements >= mid is more than mid, answer lies in second part
                if(mid < currentCount)
                    start = mid+1;
            else 
                return mid;
        }
        return -1;
    }
}