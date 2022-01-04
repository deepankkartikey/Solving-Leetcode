class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start <= end){
            // find middle element
            int mid = start + (end-start)/2;
            // if current element is greater than target
            // answer will lie in first half
            if(nums[mid] > target)
                end = mid-1;
            // if current element is less than target
            // answer will lie in second half
            else if(nums[mid] < target)
                    start = mid+1;
            else 
                return mid;
        }
        return -1;
    }
}