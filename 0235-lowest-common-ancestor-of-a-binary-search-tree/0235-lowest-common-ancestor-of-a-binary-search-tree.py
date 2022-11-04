# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        min_val = min(p.val, q.val)
        max_val = max(p.val, q.val)
        
        while True:
            if min_val <= root.val <= max_val:
                return root
            elif max_val < root.val: # both values lie in left subtree
                root = root.left # LCA should be in left subtree
            elif min_val > root.val: # both values lie in right subtree
                root = root.right # LCA should be in right subtree
            
        