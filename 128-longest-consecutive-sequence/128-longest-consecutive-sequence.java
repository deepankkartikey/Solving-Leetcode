class Solution {
    public int longestConsecutive(int[] nums) {
        // put all elements in a hashset
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num: nums){
            hs.add(num);
        }
        
        int maxLen = 0;
        
        for(int num: nums){
            // if number-1 is present in set, then current element is not start of sequence => Do nothing
            if(hs.contains(num-1)){
                continue;
            }
            // else current element can be start of sequence
            // keep incrementing current length until next numbers are present in set
            else {
                int currLen = 0;
                while(hs.contains(num++)){
                    currLen++;
                }
                // update max length accordingly
                maxLen = Math.max(currLen, maxLen);
            }
        }
        return maxLen;
    }
}