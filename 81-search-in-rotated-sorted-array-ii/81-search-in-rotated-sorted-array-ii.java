class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        // find pivot first
        int pivot = findPivotWithDuplicates(nums);
        // binary search on start, pivot
        boolean left = binarySearch(nums, start, pivot, target);
        // binary search on pivot+1, end
        if(left)
            return left;
        return binarySearch(nums, pivot+1, end, target);
    }
    
    // serch pivot among duplicate elements in rotated array
    int findPivotWithDuplicates(int[] nums){
        int start, end;
        start = 0;
        end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            // if middle is greater than next element
            // it is descending part
            // hence pivot is found
            if(mid < end && nums[mid] > nums[mid+1])
                return mid;
            // if middle is less than previous element
            // it is descending part
            // hence pivot is found
            if(mid > start && nums[mid] < nums[mid-1])
                return mid-1;
            // if found duplicate
            // start, middle, end elements are equal
            if(nums[start]==nums[mid] && nums[end]==nums[mid]){
                // if start is greater than next element, descending part
                // start is pivot
                if(start < end && nums[start] > nums[start+1])
                    return start;
                // if start and next element are same, just skip current element
                start++;
                // if end is less than previous element, descending part
                // previous element is pivot
                if(end > start && nums[end] < nums[end-1])
                    return end-1;
                // if end and previous to end are the same, just skip end element
                end--;
            }
            // if first part is ascending 
            // OR first and middle are equal but middle is greater than end
            // pivot lies in second part
            else if(nums[start] < nums[mid] || nums[start]==nums[mid] && nums[mid] > nums[end])
                start = mid+1;
            // pivot lies in first part
            else
                end = mid-1;
        }
        return -1;
    }
    
    // basic binary search
    boolean binarySearch(int[] nums, int left, int right, int target){
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] < target)
                left = mid+1;
            else if(nums[mid] > target)
                    right = mid-1;
            else 
                return true;
        }
        return false;
    }
}