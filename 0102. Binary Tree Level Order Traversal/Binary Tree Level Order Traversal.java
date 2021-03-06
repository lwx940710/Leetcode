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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList();
        }
        HashMap<Integer, ArrayList<Integer>> map = new HashMap();
        getList(map, 1, root);
        return new ArrayList(map.values());
    }
    
    private void getList(HashMap<Integer, ArrayList<Integer>> map, int level, TreeNode node) {
        if (map.containsKey(level)) {
            ArrayList<Integer> lst = map.get(level);
            lst.add(node.val);
            map.put(level, lst);
        } else {
            ArrayList<Integer> lst = new ArrayList();
            lst.add(node.val);
            map.put(level, lst);
        }
        if (node.left != null) getList(map, level + 1, node.left);
        if (node.right != null) getList(map, level + 1, node.right);
    }
}