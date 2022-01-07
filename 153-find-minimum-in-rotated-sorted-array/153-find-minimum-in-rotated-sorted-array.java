class Solution {
    public int findMin(int[] nums) {
        // smallest element in sorted rotated array is next to pivot
        // find pivot and return element next to pivot
        int pivot = findPivot(nums);
        return nums[pivot+1];
    }
    
    int findPivot(int[] nums){
        int start=0, end=nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            // if middle is greater than next element, found descending part
            // middle element is pivot
            if(mid<end && nums[mid] > nums[mid+1])
                return mid;
            // if element previous to middle is greater than middle element, found descending part
            // element previous to middle is pivot
            if(mid>start && nums[mid] < nums[mid-1])
                return mid-1;
            // if start is greater than or equal to middle
            // pivot lies in first part
            if(nums[start] >= nums[mid])
                end = mid-1;
            // if start is NOT greater or equal to middle
            // pivot lies in second part
            else
                start = mid+1;
        }
        // when array is not rotated, no pivot found
        return -1;
    }
}