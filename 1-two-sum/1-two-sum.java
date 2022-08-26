class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int idx=0; idx<nums.length; idx++){
            if(hm.containsKey(target-nums[idx])){
                res[0] = idx;
                res[1] = hm.get(target-nums[idx]);
            }
            else{
                hm.put(nums[idx], idx);
            }
        }
        return res;
    }
}