class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // take 2 pointers, start and end
        int start = 0, end = numbers.length-1;
        while(start < end){
            // if current sum is greater than target, decrement end pointer
            if(numbers[start] + numbers[end] > target)
                end--;
            // if current sum is smaller than target, increment start pointer
            else if(numbers[start] + numbers[end] < target)
                    start++;
            // if target found, return start and end indices
            // remember indices start from 1
            else
                return new int[]{start+1, end+1};
        }
        return new int[]{-1,-1};
    }
}