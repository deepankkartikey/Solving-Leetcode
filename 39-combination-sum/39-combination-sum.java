class Solution {
    
    public void findCombinations(int idx, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        // BASE CASE
        if(idx == arr.length){
            // end of indices and found a valid subsequence
            // add subsequence to ans list
            if(target == 0)
                ans.add(new ArrayList<>(ds));
            return; 
        }
 
        // when current candidate is less than or equal to target
        // add to current subsequence and make call for repetition
        if(arr[idx] <= target){
            ds.add(arr[idx]);
            findCombinations(idx, arr, target-arr[idx], ans, ds);
            ds.remove(ds.size()-1);
        }
        // when current candidate is greater than target
        // just move to next candidate and repeat process for finding valid subsequence
        findCombinations(idx+1, arr, target, ans, ds);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}