/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = head;
        ListNode pre = dummy;
        
        int index = 1;
        while (index < m) {
            pre = pre.next;
            ptr = ptr.next;
            index++;
        }
        
        ListNode then = ptr.next;
        while (index >= m && index < n) {
            ptr.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = ptr.next;
            index++;
        }
        
        return dummy.next;
    }
}