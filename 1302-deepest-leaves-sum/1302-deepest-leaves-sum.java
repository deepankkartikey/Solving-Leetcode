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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        int levelSum = 0;
        
        while(!q.isEmpty()){
            levelSum = 0;
            int size = q.size();
            while(size-- > 0){
                TreeNode currentNode = q.poll();
                levelSum += currentNode.val;
                if(currentNode.left != null)
                    q.offer(currentNode.left);
                if(currentNode.right != null)
                    q.offer(currentNode.right);
            }
        }
        return levelSum;
    }
}