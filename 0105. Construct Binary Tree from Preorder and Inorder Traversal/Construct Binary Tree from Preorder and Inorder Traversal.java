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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null
            || preorder.length == 0 || inorder.length == 0) return null;
        HashMap<Integer, Integer> indice = new HashMap();
        for (int i = 0; i < inorder.length; i++) {
            indice.put(inorder[i], i);
        }
        return getTree(indice, preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    
    private TreeNode getTree(HashMap<Integer, Integer> indice, int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        int index = indice.get(pre[preStart]);
        TreeNode node = new TreeNode(pre[preStart]);
        node.left = getTree(indice, pre, preStart + 1, preStart + index - inStart, in, inStart, index - 1);
        node.right = getTree(indice, pre, preStart + index - inStart + 1, preEnd, in, index + 1, inEnd);
        return node;
    }
}