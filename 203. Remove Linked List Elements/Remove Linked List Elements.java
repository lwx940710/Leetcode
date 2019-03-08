/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = head;
        ListNode pre = dummy;
        while (ptr != null && pre != null) {
            if (ptr.val == val) {
                pre.next = ptr.next;
            } else {
                pre = pre.next;
            }
            ptr = ptr.next;
        }
        return dummy.next;
    }
}