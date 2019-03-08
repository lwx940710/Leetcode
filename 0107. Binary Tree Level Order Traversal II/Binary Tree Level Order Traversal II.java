class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        recursiveLevelOrderBottom(root, 0, result);
        return result;
    }
    
    private void recursiveLevelOrderBottom(TreeNode root, int height, LinkedList<List<Integer>> result) {
        if (root == null) {
            return;
        }
        
        if (height == result.size()) {
            result.addFirst(new ArrayList<>());
        } else if (height < result.size()) {
            result.addFirst(result.removeLast());
        }
        
        recursiveLevelOrderBottom(root.left, height + 1, result);
        recursiveLevelOrderBottom(root.right, height + 1, result);
        
        result.peek().add(root.val);
        result.add(result.remove());
    }
}