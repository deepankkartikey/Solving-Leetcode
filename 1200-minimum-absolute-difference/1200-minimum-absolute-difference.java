class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList();
        
        // sort the array
        Arrays.sort(arr);
        
        // min difference declaration
        int minDiff = Integer.MAX_VALUE;
        
        // traverse array and check min diff
        // if diff < minDiff, create new list
        // if diff == minDiff, keep adding pairs to current result list
        for(int idx=0; idx<arr.length-1; idx++){
            int currDiff = arr[idx+1]-arr[idx];
            if(currDiff < minDiff){
                minDiff = currDiff;
                res.clear();
                res.add(Arrays.asList(arr[idx],arr[idx+1]));
            }
            else if(currDiff == minDiff){
                res.add(Arrays.asList(arr[idx], arr[idx+1]));
            }
        }
        return res;
    }
}