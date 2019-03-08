/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode ptr = head;
        
        while (ptr != null) {
            ListNode tmp = ptr.next;
            ptr.next = pre;
            pre = ptr;
            ptr = tmp;
        }
        
        return pre;
    }
}