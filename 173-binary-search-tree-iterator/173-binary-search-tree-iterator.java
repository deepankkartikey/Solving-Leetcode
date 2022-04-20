/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    
    List<Integer> inOrderTraversal = new ArrayList<Integer>();
    int index = 0;
    
    public void inOrder(TreeNode root){
        if(root == null)
            return;
        inOrder(root.left);
        inOrderTraversal.add(root.val);
        inOrder(root.right);
    }
    
    public BSTIterator(TreeNode root) {
        inOrder(root);
    }
    
    public int next() {
        return inOrderTraversal.get(index++); 
    }
    
    public boolean hasNext() {
        return index < inOrderTraversal.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */