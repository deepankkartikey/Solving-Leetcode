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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        // base case
        if(root == null)
            return null;
        
        // if current node value is within range make recursive calls for children
        if(root.val >= low && root.val <= high){
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
            return root;
        }
        
        // if current node value is greater than upper bound, all nodes on right can be neglected
        if(root.val > high){
            return trimBST(root.left, low, high);
        }
        
        // if current node value is less than lower bound, all nodes on left can be neglected
        else 
            if(root.val < low){
                return trimBST(root.right, low, high);
        }
        
        return root;
    }
}