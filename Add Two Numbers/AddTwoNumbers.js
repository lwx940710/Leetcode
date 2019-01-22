/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function (l1, l2) {
    let carry = 0;

    const result = new ListNode();
    let curr = result;

    while (l1.val !== undefined || l2.val !== undefined) {
        if (curr.val !== undefined) {
            curr = curr.next = new ListNode();
        }
        const v1 = l1.val || 0;
        const v2 = l2.val || 0;

        const sum = v1 + v2 + carry;
        carry = 0;

        if (sum >= 10) {
            curr.val = sum - 10;
            carry = 1;
        } else {
            curr.val = sum;
        }
        l1 = l1.next || {};
        l2 = l2.next || {};
    }

    if (carry) {
        curr.next = new ListNode(1)
    }

    return result;
};