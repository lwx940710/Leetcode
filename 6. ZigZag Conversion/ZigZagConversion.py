class Solution:
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if (numRows == 1):
        	return s
        currRow = 1
        down = True
        row_map = {}
        for i, c in enumerate(s):
        	if (currRow in row_map):
        		row_map[currRow] += c
        		if (down):
        			if (currRow == numRows):
        				down = False
        				currRow = numRows - 1
        			else:
        				currRow += 1
        		else:
        			if (currRow == 1):
        				down = True
        				currRow = 2
        			else:
        				currRow -= 1
        	else:
        		row_map[currRow] = c
        		if (currRow == numRows):
        			down = False
        			currRow = numRows - 1
        		else:
        			currRow += 1
        result = ""
        for i in range(1, numRows + 1):
        	if (i in row_map):
        		result += row_map[i]
        	else:
        		break
        return result
        