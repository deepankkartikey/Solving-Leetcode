class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        // two pointer approach
        int even = 0, odd = 1;
        int n = nums.length;
        // keep moving pointers by increment of 2, 
        // if numbers are at correct place
        while(even < n && odd < n){
            while(even < n && nums[even]%2 == 0)
                even+=2;
            while(odd < n && nums[odd]%2 == 1)
                odd+=2;
            // while traversing if any mismatch of index and number is found
            // swap the two pointers' values
            if(even < n && odd < n)
                swap(nums, even, odd);
        }
        return nums;
    }
    
    void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}