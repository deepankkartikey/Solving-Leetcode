class Solution {
    public int firstMissingPositive(int[] nums) {
        // apply cyclic sort
        // neglect -ve numbers and numbers greater than n (=array.length), when sorting
        int idx=0;
        while(idx < nums.length){
            int correctIdx = nums[idx]-1;
            if(nums[idx]>0 && nums[idx]<nums.length && nums[idx]!=nums[correctIdx])
                swap(nums, idx, correctIdx);
            else
                idx++;
        }
        
        // check which (index, element) combination is wrong at first
        // if no such combination found last element is missing
        for(int i=0; i<nums.length; i++)
            if(nums[i] != i+1)
                return i+1;
        
        return nums.length+1;
    }
    
    void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}