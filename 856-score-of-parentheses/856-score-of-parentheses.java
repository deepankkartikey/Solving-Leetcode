class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int score = 0;
        // traverse parentheses string character by character
        // if current character is opening brace
        // push current score to stack and set score to 0
        // if current character is a closing brace
        // pop top of stack and add max(currentScore*2 OR 1)
        for(char c: s.toCharArray()){
            if(c == '('){
                st.push(score);
                score = 0;
            }
            else {
                score = st.pop() 
                        + Math.max(score*2, 1);
            }
        }
        
        return score;
    }
}