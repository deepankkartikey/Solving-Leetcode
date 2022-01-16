class Solution {
    public int findKthPositive(int[] arr, int k) {
        // modified binary search
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            // each element should be equal to index+1 value if no element is missing
            // but since elements are missing,
            // element missing at ith index is equal to i+1
            // if missing element is smaller than kth value,
            // move to second part
            if(arr[mid]-(mid+1) < k)
                start = mid+1;
            // if missing element is greater than kth value,
            // move to first part
            else
                end = mid-1;
        }
        return start+k;
    }
}