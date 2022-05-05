class MyStack {

    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList();
    }
    
    // add each element to queue and then reverse queue by removing and adding all elements again except the last one
    public void push(int x) {
        q.add(x);
        int size = q.size();
        while(size-->1)
            q.add(q.poll());
    }
    
    // just remove element from reverse queue
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */