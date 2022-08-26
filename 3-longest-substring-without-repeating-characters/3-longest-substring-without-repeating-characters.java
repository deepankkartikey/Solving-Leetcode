class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int left, right;
        left = right = 0;
        int len = 0;
        
        while(right < s.length()){
            char currentChar = s.charAt(right);
            if(hm.containsKey(currentChar)){
                left = Math.max(hm.get(currentChar)+1, left);
            }
            hm.put(currentChar, right);
            len = Math.max(len, right-left+1);
            right++;
        }
        return len;
    }
}