/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return checkValid(root, null, null);
    }
    
    private boolean checkValid(TreeNode ptr, TreeNode low, TreeNode high) {
        if (ptr == null) return true;
        if (low != null && ptr.val <= low.val) return false;
        if (high != null && ptr.val >= high.val) return false;
        
        boolean left = (ptr.left == null) || checkValid(ptr.left, low, ptr);
        boolean right = (ptr.right == null) || checkValid(ptr.right, ptr, high);
        
        return left && right;
    }
}