class Solution:
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        sign = num = 0
        for i in range(len(str)):
        	if sign == 0 and str[i] == ' ':
        		continue;
        	else:
        		if sign == 0 and str[i] == '+':
        			sign = 1
        		elif sign == 0 and str[i] == '-':
        			sign = -1
        		elif str[i] >= '0' and str[i] <= '9':
        			n = int(str[i])
        			if sign == 0:
        				sign = 1
        			num = num * 10 + n
        			if num > 2147483647 and sign == 1:
        				return 2147483647
        			if num > 2147483647 and sign == -1:
        				return -2147483648
        		else:
        			return sign * num
        return sign * num
