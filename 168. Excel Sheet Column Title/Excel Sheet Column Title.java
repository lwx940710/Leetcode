class Solution {
    public String convertToTitle(int n) {
        String dict = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ans = "";
        while (n > 0) {
            ans = dict.charAt((n - 1) % 26) + ans;
            n = (n - 1) / 26;
        }
        return ans;
    }
}