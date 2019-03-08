/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        ArrayList<Integer> lst = new ArrayList();
        while (head != null) {
            lst.add(head.val);
            head = head.next;
        }
        return buildTree(lst, 0, lst.size() - 1);
    }
    
    private TreeNode buildTree(ArrayList<Integer> lst, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(lst.get(mid));
        node.left = buildTree(lst, start, mid - 1);
        node.right = buildTree(lst, mid + 1, end);
        return node;
    }
}