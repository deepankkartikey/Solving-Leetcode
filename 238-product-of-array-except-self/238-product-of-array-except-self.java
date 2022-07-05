class Solution {
    public int[] productExceptSelf(int[] nums) {
        // take product of elements in 2 parts
        // prefix product of all elements and then suffix product of all elements
        // multiply prefix and suffix to get final answer
        
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        int right = 1;
        
        // calculate prefix product and put in result for each index
        for(int i=1; i<n; i++){
            res[i] = res[i-1]*nums[i-1];
        }
        
        // calculate suffix product and put in result for each index
        for(int i=n-1; i>=0; i--){
            res[i] *= right;
            right *= nums[i];
        }
        
        return res;
    }
}