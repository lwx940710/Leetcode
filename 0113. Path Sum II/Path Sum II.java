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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return new ArrayList();
        List<List<Integer>> ans = new ArrayList();
        ArrayList<Integer> lst = new ArrayList();
        findPath(root, sum, ans, lst);
        return ans;
    }
    
    private void findPath(TreeNode node, int sum, List<List<Integer>> ans, ArrayList<Integer> lst) {
        if (node == null) return;
        lst.add(node.val);
        if (node.left == null && node.right == null) {
            if (node.val == sum) {
                ans.add(new ArrayList(lst));
            }
        }
        if (node.left != null) {
            findPath(node.left, sum - node.val, ans, lst);
        }
        if (node.right != null) {
            findPath(node.right, sum - node.val, ans, lst);
        }
        lst.remove(lst.size() - 1);
    }
}