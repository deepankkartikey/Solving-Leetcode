class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
            List<Integer> sol = null;
            if(i==0 || (i>0 && nums[i] != nums[i-1]) ){
                int st = i+1;
                int end = nums.length-1;
                int target = -(nums[i]);
                while(st < end){
                    if(nums[st]+nums[end] == target){
                        sol = Arrays.asList(nums[st], nums[end], nums[i]);
                        res.add(sol);
                        while(st<end && nums[st]==nums[st+1]) st++;
                        while(st<end && nums[end-1]==nums[end]) end--;
                        st++;
                        end--;
                    }
                    else if(nums[st]+nums[end] < target)
                        st++;
                    else
                        end--;
                }
            }
        }
        return res;
    }
}