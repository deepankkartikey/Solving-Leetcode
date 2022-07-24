class Solution {
        private void findCombinations(int idx, int[] candidates, int target, List<List<Integer>> combinations, List<Integer> combination) {
        if(idx == candidates.length){
            if(target == 0){
                combinations.add(new ArrayList(combination));
            }
            return;
        }
        
        if(candidates[idx] <= target){
            combination.add(candidates[idx]);
            findCombinations(idx, candidates, target-candidates[idx], combinations, combination);
            combination.remove(combination.size()-1);
        }
        findCombinations(idx+1, candidates, target, combinations, combination);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}