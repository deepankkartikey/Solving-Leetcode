class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // apply cyclic sort
        int i = 0;
        while(i < nums.length){
            // since range is [1,n], correct index for a number n will be n-1
            int correctIdx = nums[i]-1;
            if(nums[correctIdx] != nums[i])
                // swap and check again
                swap(nums, i, nums[i]-1);
            else
                i++;
        }
        // find list of missing numbers
        List<Integer> res = getMissingNums(nums);
        
        return res;
    }
    
    void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
    List<Integer> getMissingNums(int[] nums){
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0; i< nums.length; i++){
            if(nums[i] != i+1)
                res.add(i+1);
        }
        return res;
    }
}