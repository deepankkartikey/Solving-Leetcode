class Solution {
    public int maxArea(int[] height) {
        int st = 0;
        int end = height.length-1;
        int maxA = Integer.MIN_VALUE;
        
        while(st < end){
            int currA = Math.min(height[st], height[end])*(end-st);
            maxA = Math.max(maxA, currA);
            if(height[st] < height[end])
                st++;
            else if(height[st] > height[end])
                end--;
            else {
                st++;
                end--;
            }
        }
        return maxA;
    }
}