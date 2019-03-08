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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else if (Math.abs(getDepth(root.left) - getDepth(root.right)) <= 1) {
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }
    
    private int getDepth(TreeNode n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + Math.max(getDepth(n.left), getDepth(n.right));
        }
    }
}