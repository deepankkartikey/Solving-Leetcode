class Solution {
    public boolean isSubsequence(String s, String t) {
        // using two pointer approach
        int first=0, second=0;
        
        // special case
        if(s.length()==0)
            return true;
        
        // increment both pointers if current characters at first and second match
        // else just increment second pointer
        while(first<s.length() && second<t.length()){
            if(s.charAt(first) == t.charAt(second))
                first++;
            second++;
        }
        
        // if subsequence index is equal to subsequence length,
        // all characters were found
        // return TRUE
        return first == s.length();
    }
}