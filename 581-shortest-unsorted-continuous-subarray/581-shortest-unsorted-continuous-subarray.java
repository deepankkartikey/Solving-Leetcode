class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start = 0, end = nums.length-1;
        
        // find first and last of subarray
        while(start+1 < nums.length && nums[start] <= nums[start+1])
            start++;
        while(end-1 >= 0 && nums[end-1] <= nums[end])
            end--;
        
        if(start == nums.length-1)
            return 0;
        
        // find min and max within subarray
        int sMin = Integer.MAX_VALUE, sMax = Integer.MIN_VALUE;
        for(int i=start; i<= end; i++){
            sMin = Math.min(sMin, nums[i]);
            sMax = Math.max(sMax, nums[i]);
        }
        
        // adjust first and last according to min, max 
        while(start-1 >=0 && nums[start-1] > sMin)
            start--;
        while(end+1 < nums.length && nums[end+1] < sMax)
            end++;
        
        return end - start + 1;
        
    }
}