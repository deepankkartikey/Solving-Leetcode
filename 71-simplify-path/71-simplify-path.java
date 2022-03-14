class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        // Split string into tokens
        String[] tokens = path.split("/+");
        
        for(String token: tokens){
            // if stack is not empty and top is ..
            // remove one element 
            if(stack.size()>0 && "..".equals(token))
                stack.pop();
            // if current token is valid to be pushed then push into stack
            else if(!Arrays.asList(".","","..").contains(token))
                    stack.push(token);
        }
        // join stack element with / and return
        return "/"+String.join("/", stack);
    }
}