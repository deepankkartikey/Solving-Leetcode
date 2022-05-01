class Solution {
    public boolean backspaceCompare(String s, String t) {
        // using 2 stacks to store characters of strings
        Stack<Character> st1 = new Stack();
        Stack<Character> st2 = new Stack();
        
        int idx1, idx2;
        idx1 = idx2 = 0;
        
        while(idx1 < s.length()){
            char current = s.charAt(idx1);
            if(current == '#' && !st1.isEmpty())
                st1.pop();
            else 
                if(current != '#')
                    st1.push(current);
            idx1++;
        }
        
        while(idx2 < t.length()){
            char current = t.charAt(idx2);
            if(current == '#'&& !st2.isEmpty())
                st2.pop();
            else
                if(current != '#')
                    st2.push(current);
            idx2++;
        }
        
        return st1.toString().equals(st2.toString());
    }
}