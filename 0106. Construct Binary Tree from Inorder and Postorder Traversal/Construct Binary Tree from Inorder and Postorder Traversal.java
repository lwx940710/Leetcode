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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0
            || postorder == null || postorder.length == 0) return null;
        HashMap<Integer, Integer> indice = new HashMap();
        for (int i = 0; i < inorder.length; i++) {
            indice.put(inorder[i], i);
        }
        return getTree(indice, inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
    
    private TreeNode getTree(HashMap<Integer, Integer> indice, int[] in, int inStart, int inEnd, int[] post, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) return null;
        TreeNode node = new TreeNode(post[postEnd]);
        int index = indice.get(post[postEnd]);
        node.left = getTree(indice, in, inStart, index - 1, post, postStart, postEnd - (inEnd - index) - 1);
        node.right = getTree(indice, in, index + 1, inEnd, post, postEnd - (inEnd - index), postEnd - 1);
        return node;
    }
}