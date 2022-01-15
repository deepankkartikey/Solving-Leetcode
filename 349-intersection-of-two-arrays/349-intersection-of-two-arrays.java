class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // use a HashSet and an ArrayList
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        // Check if each element of first array is in HashSet or Not
        // if not present, insert it
        for(int num: nums1)
            if(!hs.contains(num))
                hs.add(num);
        
        // Check for each element of second array in HashSet
        // if present, add to list and remove from hashset
        for(int num: nums2)
            if(hs.contains(num)){
                al.add(num);
                hs.remove(num);
            }
        
        // convert arraylist to integer array and return 
        return al.stream().mapToInt(i->i).toArray();
    }
}