class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < Math.max(a.length(), b.length()) || carry != 0; i++) {
            int ia = (i >= a.length()) ? 0 : a.charAt(a.length() - i - 1) - '0';
            int ib = (i >= b.length()) ? 0 : b.charAt(b.length() - i - 1) - '0';
            sb.insert(0, (ia + ib + carry) % 2);
            carry = (ia + ib + carry) / 2;
        }
        return sb.toString();
    }
}
