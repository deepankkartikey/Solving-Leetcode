class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        // find last index of all characters and store
        int[] endIdx = new int[26];
        for(int i=0; i<s.length(); i++)
            endIdx[s.charAt(i)-'a'] = i;
        
        // traverse the string again 
        // and check for each number's range 
        // if all numbers are within range of a character,
        // it forms a valid part
        // like ababcbaca
        int i=0;
        while(i<s.length()){
            char startChar = s.charAt(i);
            int terminalIdx = endIdx[startChar-'a'];
            for(int j=0; j<=terminalIdx; j++)
                terminalIdx = Math.max(terminalIdx, endIdx[s.charAt(j)-'a']);
            ans.add(terminalIdx - i + 1);
            i = terminalIdx + 1;
        }
        return ans;
    }
}