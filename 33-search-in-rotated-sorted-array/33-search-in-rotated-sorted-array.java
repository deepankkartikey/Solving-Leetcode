class Solution {
    private int findPivot(int[] nums){
        int st=0, end=nums.length-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(mid < end && nums[mid] > nums[mid+1])
                return mid;
            else if(mid > st && nums[mid] < nums[mid-1])
                    return mid-1;
            else if(nums[st] <= nums[mid])
                    st = mid+1;
            else if(nums[mid] <= nums[end])
                    end = mid-1;
        }
        return -1;
    }
    
    private int binarySearch(int[] nums, int st, int end, int target){
        while(st <= end){
            int mid = st + (end-st)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                    st = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
    
    public int search(int[] nums, int target) {
        // find pivot element
        int pivotIdx = findPivot(nums);
        
        // apply binary search on [0, pivot] and [pivot+1, nums.length-1]
        int leftRes = binarySearch(nums, 0, pivotIdx, target);
        int rightRes = binarySearch(nums, pivotIdx+1, nums.length-1, target);
        return leftRes==-1 ? rightRes : leftRes;
    }
}