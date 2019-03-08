class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        abs_x = abs(x)
        result = 0
        while (abs_x  != 0):
            r = abs_x  % 10
            result = result * 10 + r
            abs_x  = abs_x  // 10
        if (x > 0 and result < 2 ** 31):
            return result
        elif (x < 0 and result <= 2 ** 31):
            return -result
        else:
            return 0
        