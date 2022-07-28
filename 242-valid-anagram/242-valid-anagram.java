class Solution {
    public boolean isAnagram(String s, String t) {
        String s1, s2;
        if(s.length() > t.length()){
            s1 = s;
            s2 = t;
        } else {
            s1 = t;
            s2 = s;
        }
        
        int[] occurs = new int[26];
        
        for(char s1Char: s1.toCharArray())
            occurs[s1Char-'a']++;
        
        for(char s2Char: s2.toCharArray())
            occurs[s2Char-'a']--;
        
        for(int occur: occurs){
            if(occur != 0)
                return false;
        }
        return true;
    }
}