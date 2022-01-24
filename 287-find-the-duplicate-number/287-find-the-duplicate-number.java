class Solution {
    public int findDuplicate(int[] nums) {
        // apply cyclic sort
        int idx = 0;
        while(idx < nums.length){
            // if current number is not at correct index. i.e. nums[i] != i+1
            // then nums[i] must be present at correctIdx i.e. nums[i]-1
            // if not then swap
            // else duplicate element found
            if(nums[idx] != idx+1){
                int correctIdx = nums[idx]-1;
                if(nums[idx] != nums[correctIdx])
                    swap(nums, idx, correctIdx);
                else
                    return nums[idx];
            }
            else
                idx++;
        }
        return -1;
    }
    
    void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}