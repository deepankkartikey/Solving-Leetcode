class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        // pointer for popped[]
        int j=0;
        // iterated pushed[]
        // keep pushing elements
        // ALSO, keep checking top of stack with current popped[j],
        // if same then pop from stack and increment popped[] iterator
        for(int p: pushed){
            st.push(p);
            while(!st.isEmpty() &&
                 j<popped.length &&
                 st.peek() == popped[j])
            {
                st.pop();
                j++;
            }
        }
        // finally popped[] iterator should have traversed complete array
        return j == popped.length;
    }
}