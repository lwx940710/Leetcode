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
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<TreeNode>();
        return buildTree(1, n);
    }
    
    private List<TreeNode> buildTree(int i, int j) {
        List<TreeNode> lst = new ArrayList();
        
        if (i > j) {
            lst.add(null);
            return lst;
        }
        if (i == j) {
            lst.add(new TreeNode(i));
            return lst;
        }
        
        for (int k = i; k <= j; k++) {
            List<TreeNode> left = buildTree(i, k - 1);
            List<TreeNode> right = buildTree(k + 1, j);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(k);
                    root.left = l;
                    root.right = r;
                    lst.add(root);
                }
            }
        }
        return lst;
    }
}