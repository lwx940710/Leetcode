/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = head;
        ListNode secondHead = dummy, preFast = dummy;

        while (fast != null) {
            if (fast.val >= x) {
                secondHead = fast;
                break;
            } else {
                slow = slow.next;
            }
            preFast = fast;
            fast = fast.next;
        }
        while (fast != null) {
            if (fast.val < x) {
                preFast.next = fast.next;
                slow.next = fast;
                slow.next.next = secondHead;
                slow = slow.next;

            } else {
                preFast = preFast.next;
            }
            fast = preFast.next;
        }
        return dummy.next;
    }
}