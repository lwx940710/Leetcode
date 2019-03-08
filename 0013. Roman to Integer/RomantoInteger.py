class Solution:
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        if s == "" or len(s) == 0:
            return 0
        elif s[0] == 'M':
            return 1000 + self.romanToInt(s[1:])
        elif s[0] == 'D':
            return 500 + self.romanToInt(s[1:])
        elif s[0] == 'C':
            if len(s) > 1 and s[1] == 'M':
                return 900 + self.romanToInt(s[2:])
            elif len(s) > 1 and s[1] == 'D':
                return 400 + self.romanToInt(s[2:])
            else:
                return 100 + self.romanToInt(s[1:])
        elif s[0] == 'L':
            return 50 + self.romanToInt(s[1:])
        elif s[0] == 'X':
            if len(s) > 1 and s[1] == 'C':
                return 90 + self.romanToInt(s[2:])
            elif len(s) > 1 and s[1] == 'L':
                return 40 + self.romanToInt(s[2:])
            else:
                return 10 + self.romanToInt(s[1:])
        elif s[0] == 'V':
            return 5 + self.romanToInt(s[1:])
        elif s[0] == 'I':
            if len(s) > 1 and s[1] == 'X':
                return 9 + self.romanToInt(s[2:])
            elif len(s) > 1 and s[1] == 'V':
                return 4 + self.romanToInt(s[2:])
            else:
                return 1 + self.romanToInt(s[1:])
        return 0
