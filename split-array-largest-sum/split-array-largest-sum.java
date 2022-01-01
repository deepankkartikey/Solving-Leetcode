class Solution {
    public int splitArray(int[] nums, int m) {
        int start, end;
        start = end = 0;
        for(int num: nums){
            // The minimum possible sum occurs when number of subarrays == size of array
            // Hence each sub array will have only 1 number 
            // and minimum possible sum is max of all elements
            start = Math.max(start, num);
            // The maximum possible sum occurs when number of subarrays == 1
            // Hence only one subarray is present containing all the elements
            // and maximum possible sum is sum of all elements
            end += num;
        }
        
        // Now try to find the best possible answer
        while(start < end){
            int mid = start + (end-start)/2;
            // calculate sum for possible number of subarrays (pieces)
            int sum = 0, pieces = 1;
            for(int num: nums){
                if(sum+num > mid){
                    // current sum exceeded max possible sum at this step
                    // reset current sum & need to create a new subarray
                    pieces++;
                    sum = num;
                    
                }
                else {
                sum += num;
                }
            }
            // if current number of subarrays exceeds max possible subarrays
            // increase current possible subarrays count
            if(pieces > m)
                start = mid+1;
            else
                end = mid;
        }
        return end; // start == end
    }
}