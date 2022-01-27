class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        // apply cyclic sort
        int idx=0;
        while(idx < nums.length){
            int correctIdx = nums[idx]-1;
            if(nums[idx] != nums[correctIdx])
                swap(nums, idx, correctIdx);
            else
                idx++;
        }
        
        // find missing and repeated number
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                res[0] = nums[i];
                res[1] = i+1;
            }
        }
        return res;
    }
    
    void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}