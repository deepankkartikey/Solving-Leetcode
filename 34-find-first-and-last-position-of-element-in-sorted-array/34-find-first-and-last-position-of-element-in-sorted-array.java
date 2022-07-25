class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        res[0] = search(nums, target, true);
        res[1] = search(nums, target, false);
        return res;
    }
    
    private int search(int[] nums, int target, boolean firstOccurence){
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        int tempIdx = -1;
        while(start <= end){
            mid = start + (end-start)/2;
            if(nums[mid] < target){
                start = mid+1;
            } else if(nums[mid] > target){
                        end = mid-1;
            } else {
                tempIdx = mid;
                if(firstOccurence){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return tempIdx;
    }
}