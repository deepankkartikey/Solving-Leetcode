class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        // start filling result array from end
        int i = nums.length-1;
        // take 2 point start and end
        // compare numbers at both start and end
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int first = Math.abs(nums[start]);
            int last = Math.abs(nums[end]);
            // if absolute value of number at start is greater,
            // put square in result
            if(first >= last){
                res[i--] = first*first;
                start++;
            }
            // if absolute value of number at end is greater,
            // put square in result
            else{
                res[i--] = last*last;
                end--;
            }
        }
        return res;
    }
}