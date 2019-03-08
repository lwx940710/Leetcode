class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        int len = needle.length();
        for (int i = 0; i <= haystack.length() - len; i++) {
            String subStr = haystack.substring(i, i + len);
            if (subStr.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}