class Solution {
    public int largestPerimeter(int[] nums) {
        // sort array in ascending order
        Arrays.sort(nums);
        
        // traverse array from end to start, 
        // whilst checking
        // sum of 2 sides always greater than the third side
        // return first possible triangle's perimeter
        for(int idx = nums.length-3; idx>= 0 ;idx--){
            if(nums[idx]+nums[idx+1] > nums[idx+2])
                return nums[idx]+nums[idx+1]+nums[idx+2];
        }
        return 0;
    }
}