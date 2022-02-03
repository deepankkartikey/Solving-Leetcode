class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // traverse array
        // check if num is even or odd
        // if even put in left part else put in right part
        int[] res = new int[nums.length];
        int start = 0, end = nums.length-1;
        for(int num: nums){
            if(num%2 == 0)
                res[start++] = num;
            else 
                res[end--] = num;
        }
        return res;
    }
}