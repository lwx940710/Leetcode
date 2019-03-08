class Solution:
    def expandAroundCenter(self, s, l, r):
    	while (l >= 0 and r < len(s) and s[l] == s[r]):
    		l -= 1
    		r += 1
    	if self.max_len < r - l - 1:
            self.max_len = r - l - 1
            self.start = l + 1
            self.end = r
    
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        if (not s or len(s) < 1):
        	return ""
       	self.start = self.end = 0
        self.max_len = 0
        
       	for i in range(len(s)):
       		self.expandAroundCenter(s, i, i)
       		self.expandAroundCenter(s, i, i+1)
       	return s[self.start:self.end]
