class Solution:
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        max_sub = 0
        dct = {}
        i = 0
        for j in range(0, len(s)):
        	if s[j] in dct:
        		i = max(dct[s[j]], i)
        	max_sub = max(max_sub, j - i + 1)
        	dct[s[j]] = j + 1
        return max_sub
        