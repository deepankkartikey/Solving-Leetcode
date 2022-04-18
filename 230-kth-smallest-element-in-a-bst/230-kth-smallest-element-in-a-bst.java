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
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int []res = new int[2];
        inOrderTraversal(root, k, res);
        return res[1];
    }
    
    public void inOrderTraversal(TreeNode root, int k , int[] res){
        if(root == null)
            return;
        
        inOrderTraversal(root.left, k, res);
        if(++res[0] == k){
            res[1] = root.val;
            return;
        }
        inOrderTraversal(root.right, k, res);
    }
}