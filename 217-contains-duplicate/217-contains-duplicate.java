class Solution {
    public boolean containsDuplicate(int[] nums) {
        // use hashset to keep tract of distinct elements
        // if a duplicate is found return true and break
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num: nums){
            if(hs.contains(num)){
                return true;
            }
            hs.add(num);
        }
        return false;
    }
}