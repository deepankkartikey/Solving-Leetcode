class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int previousCount = 0;
        int total = 0;
        
        for(int i=2; i<nums.length; i++){
            if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2])
                previousCount++;
            else
                previousCount=0;
            
            total += previousCount;
        }
        return total;
    }
}