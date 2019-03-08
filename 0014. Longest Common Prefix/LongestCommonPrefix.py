class Solution:
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if len(strs) == 0:
            return ""
        min_length = 2 ** 31
        for i in range(len(strs)):
            if len(strs[i]) < min_length:
                min_length = len(strs[i])
        prefix = ""
        for i in range(min_length):
            c = strs[0][i]
            for j in range(len(strs)):
                if strs[j][i] != c:
                    return prefix
            prefix += c
        return prefix
