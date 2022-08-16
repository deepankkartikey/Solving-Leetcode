class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] picked = new boolean[nums.length];
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        findPermutations(nums, ds, ans, picked);
        return ans;
    }
    
    private void findPermutations(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] picked){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int idx=0; idx<nums.length; idx++){
            if(!picked[idx]){
                picked[idx] = true;
                ds.add(nums[idx]);
                findPermutations(nums, ds, ans, picked);
                ds.remove(ds.size()-1);
                picked[idx] = false;
            }
        }
    }
}