class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] fix = new boolean[nums.length];
        permutations(nums, ds, ans, fix);
        return ans;
    }
    
    private void permutations(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] fix){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=0; i<nums.length; i++){
            if(!fix[i]){
                fix[i]=true;
                ds.add(nums[i]);
                permutations(nums, ds, ans, fix);
                ds.remove(ds.size()-1);
                fix[i]=false;
            }
        }
    }
}