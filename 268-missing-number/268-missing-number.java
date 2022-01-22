class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // sort the array using cyclic sort
        sort(nums);
        
        // after sorting index == value
        // check which number is not at correct index
        int i = 0;
        while(i < n){
            if(i != nums[i])
                return i;
            else
                i++;
        }
        return n;
    }
    
    public void sort(int[] nums){
        int i = 0;
        while(i < nums.length){
            // correct index for current number
            int correctIdx = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIdx]){
                // if current number not at correct index swap it
                swap(nums, i, correctIdx);
            }else{
                i++;
            }
        }
    }
    
    public void swap(int[] nums, int first, int second){
        int temp = nums[second];
        nums[second] = nums[first];
        nums[first] = temp;
    }
}