class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // create 2 arrays of fixed size, as input size is fixed
        int[] record = new int[1001];
        int[] intersection = new int[1001];
        int count = 0;
        // record occurences of each element of array
        for(int num: nums1){
            record[num]++;
        }
        
        // find interesection and store
        for(int num: nums2){
            if(record[num] > 0){
                intersection[count++] = num;
                // decrement the intersected element
                record[num]--;
            }
        } 
        return Arrays.copyOfRange(intersection, 0, count);  
    }
}