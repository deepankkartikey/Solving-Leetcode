class Solution {
    public int search(int[] nums, int target){
        int start=0, end=nums.length-1;
        int pivotIdx = findPivot(nums);
        int firstPart = binarySearch(nums, target, start, pivotIdx);
        if(firstPart != -1)
            return firstPart;
        return binarySearch(nums, target, pivotIdx+1, end);
    }
    
    int findPivot(int[] nums){
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid<end && nums[mid] > nums[mid+1])
                return mid;
            if(mid>start && nums[mid] < nums[mid-1])
                return mid-1;
            if(nums[mid] <= nums[start])
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }
    
    int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] < target)
                start = mid+1;
            else if(nums[mid] > target)
                    end = mid-1;
            else
                return mid;
        }
        return -1;
    }
}