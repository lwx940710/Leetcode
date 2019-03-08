/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode abstractHead = new ListNode(0);
        abstractHead.next = head;
        ListNode node1 = abstractHead;
        ListNode node2 = abstractHead;
        
        for (int i = 1; i <= n; i++) {
            node2 = node2.next;
        }
        
        while (node2.next != null) {
            node1 = node1.next;
            node2 = node2.next;
        }
        
        node1.next = node1.next.next;
        return abstractHead.next;
        
    }
}