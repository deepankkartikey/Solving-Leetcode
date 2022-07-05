class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        HashMap<Character, Boolean> used = new HashMap<Character, Boolean>();
        
        if(s.length() != t.length()) {
            return false;
        }
        
        for(int i=0; i<len; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if(map.containsKey(ch1)){
                if(map.get(ch1) != ch2){
                    return false;
                }
            }
            else {
                if(used.containsKey(ch2)) {
                    return false;
                }
                else {
                    map.put(ch1, ch2);
                    used.put(ch2, true);
                }
            }
        }
        return true;
    }
}