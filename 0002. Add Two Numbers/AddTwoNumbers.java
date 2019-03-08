/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int carry = 0;
        ListNode curr = result;
        while (l1 || l2) {
            int n1 = l1 ? l1.val : 0;
            int n2 = l2 ? l2.val : 0;
            int sum = l1 + l2 + carry;
            carry = sum / 10;
            curr.val = sum % 10;
            curr.next = new ListNode(0);
            curr = curr.next;
            if (l1) {
                l1 = l1.next;
            }
            if (l2) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            curr.next.val = carry;
        }
        return result;
    }
}