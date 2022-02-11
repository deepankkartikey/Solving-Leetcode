class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // special case: less than 2 elements
        if(arr.length <= 1)
            return false;
        
        // sort the array
        Arrays.sort(arr);
        
        // if array is in Arithmetic progression,
        // difference between any 2 elements will be the same
        // calculate difference between first two elements
        int difference = arr[1] - arr[0];
        
        // check if all number pairs have same difference or not
        for(int idx=2; idx<arr.length; idx++){
            if(arr[idx]-arr[idx-1] != difference)
                return false;
        }
        return true;
    }
}