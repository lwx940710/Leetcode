/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = head;
        ListNode pre = dummy;
        int dupVal = -1;
        boolean hasDup = false;
        
        while (ptr != null && ptr.next != null) {
            if (ptr.val == ptr.next.val) {
                dupVal = ptr.val;
                hasDup = true;
                pre.next = ptr.next.next;
            } else if (hasDup && dupVal == ptr.val) {
                pre.next = ptr.next;
            } else {
                dupVal = -1;
                hasDup = false;
                pre = pre.next;
            }
            ptr = pre.next;
        }
        
        if (ptr != null && hasDup && ptr.val == dupVal) {
            pre.next = null;
        }
        
        return dummy.next;
    }
}