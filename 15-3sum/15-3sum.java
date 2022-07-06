class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int st=i+1;
                int end=nums.length-1;
                int target = -nums[i];
                while(st < end){
                    if(nums[st]+nums[end] == target){
                        res.add(Arrays.asList(nums[st], nums[end], nums[i]));
                        while(st<end && nums[st]==nums[st+1]) st++;
                        while(end>st && nums[end]==nums[end-1])end--;
                        st++;
                        end--;
                    } else if(nums[st]+nums[end] < target){
                        st++;
                    }else{
                        end--;
                    }
                }
            }
        }
        return res;
    }
}