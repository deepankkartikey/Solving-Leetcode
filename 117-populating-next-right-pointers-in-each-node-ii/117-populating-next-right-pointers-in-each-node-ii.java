/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null)
            return root;
        
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            Node nxtR = null;
            while(size-- > 0){
                Node head = q.poll();
                head.next = nxtR;
                nxtR = head;
                if(head.right != null)
                    q.offer(head.right);
                if(head.left != null)
                    q.offer(head.left);
            }
        }
        return root;
    }
}