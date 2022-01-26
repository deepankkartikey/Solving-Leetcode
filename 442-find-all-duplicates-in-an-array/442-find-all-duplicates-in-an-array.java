class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // apply cyclic sort  
        int idx = 0;
        while(idx < nums.length){
            // check if current element is present at correct index or not
            // element[i] should be at i-1 index
            int correctIdx = nums[idx]-1;
            // if element[i] not at correct index, swap it with correct index
            if(nums[idx] != nums[correctIdx])
                swap(nums, idx, correctIdx);
            // else move ahead  
            else
                idx++;    
        }
        
        // traverse cyclic-sorted array and return list of duplicates
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
            if(nums[i] != i+1)
                res.add(nums[i]);
                
        return res;
    }
    
    void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}