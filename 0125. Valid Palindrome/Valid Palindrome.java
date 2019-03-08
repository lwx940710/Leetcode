class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s == "" || s.length() == 0) return true;
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                char c = (char) (ch + 32);
                ss += c;
            }
            if ((ch >= 48 && ch <= 57) || (ch >= 97 && ch <= 122)) {
                ss += ch;
            }
        }
        if (ss.length() == 0) {
            return true;
        }
        for (int i = 0; i <= ss.length() / 2; i++) {
            if (ss.charAt(i) != ss.charAt(ss.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}