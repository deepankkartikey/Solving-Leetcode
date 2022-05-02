class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // traverse array
        // keep an additional index variable,
        // and keep track of even numbers
        // Keep swapping only even numbers with this index
        int sortedIdx = 0;
        for(int idx=0; idx<nums.length; idx++){
            if(nums[idx]%2 == 0){
                int temp = nums[idx];
                nums[idx] = nums[sortedIdx];
                nums[sortedIdx] = temp;
                sortedIdx++;
            }
        }
        return nums;
    }
}