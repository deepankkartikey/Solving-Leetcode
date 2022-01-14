class Solution {
    public boolean checkIfExist(int[] arr) {
        // using concept of hashset
        HashSet<Integer> hs = new HashSet<>();
        for(int num: arr){
            // look for either double of element
            // OR
            // half of the element in the hashset
            if(hs.contains(num*2) || (num%2 == 0 && hs.contains(num/2)))
                return true;
            // if element not in hashset then add it
            else
                hs.add(num);
        }
        return false;
    }
}