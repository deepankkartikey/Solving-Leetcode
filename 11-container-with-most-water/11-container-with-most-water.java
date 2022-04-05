class Solution {
    public int maxArea(int[] height) {
        // taking two-pointer approach
        int st = 0, end = height.length-1;
        int maxArea = Integer.MIN_VALUE;
        
        // traverse until two pointers cross each other
        while(st < end){
            // keep calculating area and keep track of max area
            int currentArea = Math.min(height[st],height[end])*(end-st);
            maxArea = Math.max(currentArea, maxArea);
            
            // always increment/decrement pointer which has lesser height
            if(height[st]<height[end])
                st++;
            else
                end--;
        }
        return maxArea;
    }
}