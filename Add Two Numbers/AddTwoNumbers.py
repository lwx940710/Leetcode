# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        result = ListNode(0)
        curr = result
        carry = 0
                
        while l1 or l2 or carry:            
            n1  = (l1.val if l1 else 0)
            n2  = (l2.val if l2 else 0)
            carry, out = divmod(n1 + n2 + carry, 10)    
                      
            curr.next = ListNode(out)
            curr = curr.next                      
            
            l1 = (l1.next if l1 else None)
            l2 = (l2.next if l2 else None)
               
        return result.next