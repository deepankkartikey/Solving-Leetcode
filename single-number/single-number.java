class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i=1; i<nums.length; i++){
            // using XOR operation
            // X xor X = 0
            res = res ^ nums[i];
        }
        return res;
    }
}