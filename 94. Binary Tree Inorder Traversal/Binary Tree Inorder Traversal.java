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
    /* Recursively */
    /*
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList();
        if (root == null) return ans;
        if (root.left != null) ans.addAll(inorderTraversal(root.left));
        if (root != null) ans.add(root.val);
        if (root.right != null) ans.addAll(inorderTraversal(root.right));
        return ans;
    }
    */
    
    /* Iteratively */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        if (root == null) return ans;
        
        TreeNode ptr = root;
        while (ptr != null || !stack.isEmpty()) {
            while (ptr != null) {
                stack.push(ptr);
                ptr = ptr.left;
            }
            ptr = stack.pop();
            ans.add(ptr.val);
            ptr = ptr.right;
        }
        return ans;
    }
}