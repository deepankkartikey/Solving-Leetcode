class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int length = calcMaxDiff(verticalCuts, w);
        int width = calcMaxDiff(horizontalCuts, h);
        long ans = 1L*length*width;
        return (int) (ans%1000000007);
    }
    
    private int calcMaxDiff(int[] arr, int maxheight){
        Arrays.sort(arr);
        int maxDiff = arr[0];
        for(int i=1; i<arr.length; i++){
            maxDiff = Math.max(maxDiff, arr[i]-arr[i-1]);
        }
        maxDiff = Math.max(maxDiff, maxheight-arr[arr.length-1]);
        return maxDiff;
    }
}