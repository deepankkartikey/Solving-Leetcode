class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            // descending part of array
            // either current element or one of previous elements can be answer
            if(nums[mid] > nums[mid+1])
                end = mid;
            // ascending part of array
            // one of elements after mid can be the answer
            else if(nums[mid] < nums[mid+1])
                    start = mid+1;
        }
        return start;
    }
}