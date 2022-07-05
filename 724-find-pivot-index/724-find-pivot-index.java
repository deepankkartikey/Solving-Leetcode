class Solution {
    public int pivotIndex(int[] nums) {
        // calculate sum of all elements
        int total_sum = 0;
        for(int num: nums){
            total_sum += num;
        }
        
        // in order to find pivot
        // sum of elements on left of pivot should be equal to sum of elements on right of pivot
        int left_sum = 0;
        for(int i=0; i<nums.length; i++){
            if(total_sum - left_sum - nums[i] == left_sum){
                return i;
            }
            left_sum += nums[i];
        }
        return -1;
    }
}