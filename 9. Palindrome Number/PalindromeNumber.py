class Solution:
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        reverse = 0
        if x < 0:
        	return False
        elif x == 0:
        	return True
        else:
        	xx = x
        	while xx > 0:
        		n = xx % 10
        		reverse = reverse * 10 + n
        		xx = xx // 10
        	if reverse == x:
        		return True
        	else:
        		return False
