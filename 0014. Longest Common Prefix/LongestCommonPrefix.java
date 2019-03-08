class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int min_length = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; ++i) {
            if (strs[i].length() < min_length) {
                min_length = strs[i].length();
            }
        }
        String prefix = "";
        for (int i = 0; i < min_length; ++i) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; ++j) {
                if (strs[j].charAt(i) != c) {
                    return prefix;
                }
            }
            prefix += c;
        }
        return prefix;
    }
}
