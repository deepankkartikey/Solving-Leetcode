class Solution {
    public String removeDuplicates(String s, int k) {
        // using stack for storing character and its occurence count
        Stack<Pair<Character, Integer>> st = new Stack();
        
        for(char c: s.toCharArray()){
            if(st.isEmpty() || st.peek().getKey() != c)
                st.push(new Pair<>(c, 1));
            else{
                Pair<Character, Integer> tos = st.pop();
                st.push(new Pair<>(tos.getKey(), tos.getValue()+1));
                
                // at everystep, if a repetion occurs keep checking count with k
                // if count == k, remove that character from stack
                if(st.peek().getValue() == k){
                    st.pop();
                }
            }
        }
        
        // build string from stack
        String ans = "";
        while(!st.isEmpty()){
            Pair<Character, Integer> tos = st.pop();
            char c = tos.getKey();
            int count = tos.getValue();
            while(count-->0){
                ans = c + ans;
            }
        }
        return ans;
    }
}