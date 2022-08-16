class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char tos = st.pop();
                if((ch==')' && tos=='(') ||
                    (ch==']' && tos=='[') ||
                    (ch=='}' && tos=='{'))
                    continue;
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
}