class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int len = nums.length;
        List<Integer> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int num: nums){
            arr.add(num);
        }
        Collections.sort(arr);
        
        for(int i=0; i<len; i++){
            int idx = binarySearch(arr, nums[i]);
            ans.add(idx);
            arr.remove(idx);
        }
        return ans;
    }
    
    public int binarySearch(ArrayList<Integer> arr, int target){
        int start=0, end = arr.size()-1, mid=0;
        while(start <= end){
            mid = start + (end-start)/2;
            int val = arr.get(mid);
            if(val < target)
                start = mid+1;
            else
                end = mid-1;
        }
        if(arr.get(start)==target)
            return start;
        return mid;
    }
}