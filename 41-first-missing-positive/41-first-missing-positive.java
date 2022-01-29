class Solution {
    public int firstMissingPositive(int[] nums) {
        // apply cyclic sort
        // while sorting, neglect -ve numbers ,
        // and numbers greater than n (i.e. array length)
        int idx = 0;
        while(idx < nums.length){
            int correctIdx = nums[idx]-1;
            if(nums[idx] > 0 && nums[idx] <= nums.length && nums[idx] != nums[correctIdx])
                swap(nums, idx, correctIdx);
            else 
                idx ++;
        }
        
        // after appying cyclic sort, the first wrong (index, element) combination points to the missing number
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1)
                return i+1;
        }
        // if no element was missing in middle, last (element==n) is answer
        return nums.length+1;
    }
    
    void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}