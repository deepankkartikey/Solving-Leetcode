class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        // <Value, index>
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int idx=0; idx<nums.length; idx++){
            if(hs.containsKey(target-nums[idx])){
                ans[0] = idx;
                ans[1] = hs.get(target-nums[idx]);
            }else{
                hs.put(nums[idx], idx);
            }
        }
        return ans;
    }
}