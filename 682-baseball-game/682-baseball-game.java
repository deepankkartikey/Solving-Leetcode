class Solution {
    public int calPoints(String[] ops) {
        // using a stack to store intermediate scores
        Stack<Integer> s = new Stack<>();
        Integer first, second;
        first = second = null;
        
        // read operations one by one
        for(String op: ops){
            switch(op.toCharArray()[0]){
                    case '+': first = s.pop();
                            second = s.pop();
                            s.push(second);
                            s.push(first);
                            s.push(first + second);
                        break;
                    
                case 'D': first = s.peek();
                        s.push(2*first);
                        break;
                    
                case 'C': s.pop();
                        break;
                
                default: s.push(Integer.parseInt(op));
                    break;      
            }
        }
        
        int res = 0;
        while(!s.isEmpty()){
            res+=s.pop();
        }
        return res;
    }
}