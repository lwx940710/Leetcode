/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null || k <= 0) {
            return head;
        } else {
            int count = 1;
            ListNode ptr = head;
            while (ptr.next.next != null) {
                ptr = ptr.next;
                count++;
            }
            k = k % (count + 1);
            if (k == 0) {
                return head;
            }
            ListNode newHead = ptr.next;
            newHead.next = head;
            ptr.next = null;
            return rotateRight(newHead, k - 1);
        }
    }
}