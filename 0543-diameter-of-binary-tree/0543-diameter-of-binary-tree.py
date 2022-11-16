# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def diameterOfBinaryTree(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        maxi = [0]
        
        def dfs(root, maxi):
            if root is None:
                return 0
            
            left = dfs(root.left, maxi)
            right = dfs(root.right, maxi)
            
            maxi[0] = max(maxi[0], left + right)
            
            return 1 + max(left, right)
    
        dfs(root, maxi)
        
        return maxi[0]
        