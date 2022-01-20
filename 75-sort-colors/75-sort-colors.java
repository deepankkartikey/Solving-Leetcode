class Solution {
    public void sortColors(int[] nums) {
        // 3 pointer approach
        // p0 - at start of array - points to 0's
        // p2 - at end of array - points to 2's
        // curr - points to current element
        int curr = 0, p0 = 0, p2 = nums.length-1;
        
        // until current pointer is less than p2
        while(curr <= p2){
            // if current element is 0,
            // swap curr and p0 elements
            if(nums[curr] == 0){
                swap(nums, curr, p0);
                p0++;
                curr++;
            }
            // if current element is 2,
            // swap curr and p2 elements
            else if(nums[curr] == 2){
                swap(nums, curr, p2);
                p2--;
            }
            // if current element is 1,
            // DO NOTHING
            else{
                curr++;
            }
        }
    }
    
    void swap(int[] nums, int idx1, int idx2){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}