class Solution {
    public void moveZeroes(int[] nums) {
        int leftMostZero = 0;
        for(int idx=0; idx<nums.length; idx++){
            if(nums[idx] != 0){
                int temp = nums[leftMostZero];
                nums[leftMostZero] = nums[idx];
                nums[idx] = temp;
                leftMostZero++;
            }
        }
    }
}