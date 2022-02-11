class Solution {
    public int[] twoSum(int[] nums, int target) {
        // using a hashmap to store indices for each element
        Map<Integer, Integer> hm = new HashMap<>();
        
        // check if cuurrent number and target difference present in hashset
        // if yes, return indices
        // if no, add current element to Map and move on
        for(int idx=0; idx<nums.length; idx++){
            if(hm.containsKey(target-nums[idx]))
                return new int[]{idx, hm.get(target-nums[idx])};
            else
                hm.put(nums[idx], idx);
        }
        return new int[]{0,0};
    }
}