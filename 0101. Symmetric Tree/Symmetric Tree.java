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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return mirror(root.left, root.right);
        }
    }
    
    public boolean mirror(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        } else if (n1 == null || n2 == null) {
            return false;
        } else if (n1.val == n2.val) {
            return mirror(n1.left, n2.right) && mirror(n1.right, n2.left);
        } else {
            return false;
        }
    }
}