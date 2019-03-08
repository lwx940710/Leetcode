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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildNode(nums, 0, nums.length - 1);
    }
    
    private TreeNode buildNode(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        } else {
            int mid = lo + (hi - lo) / 2;
            TreeNode n = new TreeNode(nums[mid]);
            n.left = buildNode(nums, lo, mid - 1);
            n.right = buildNode(nums, mid + 1, hi);
            return n;
        }
    }
}
