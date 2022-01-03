class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length-1;
        // since each element occurs exactly twice
        // 1st copy will present at even index and second copy will be present at odd index
        // if this pattern is missing somewhere then there is single element
        // to check pattern , either of below conditions should satisfy
        // find mid
        // 1. if mid index is even, next index should also have same number
            // Condition satisfied - move to left part
        // 2. if mid index is odd, previous index should have same number
            // Condition satisfied - move to right part
        
        while(left < right){
            int mid = left + (right-left)/2;
            if((mid % 2 == 0 && nums[mid] == nums[mid+1]) || (mid % 2 != 0 && nums[mid] == nums[mid-1]))
                left = mid+1;
            else
                right = mid;
        }
        return nums[left];
    }
}