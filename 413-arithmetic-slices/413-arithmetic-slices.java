class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        // using memoization
        // to keep track of number of slices of previous element
        int previousCount = 0;
        int total = 0;
        // loop starts with 2 because we have to consider 3 numbers at a time
        // ith, (i-1)th, (i-2)th
        for(int i=2; i<nums.length; i++){
            // arthimetic progression found
            // increment number of slices
            if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2])
                previousCount++;
            else
                // if arithmetic progression not found, set slices count to 0
                previousCount=0;
            
            // at end of each iteration, add slices count to total
            total += previousCount;
        }
        return total;
    }
}