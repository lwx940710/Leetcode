class Solution {
    public int[] plusOne(int[] digits) {
        boolean b = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                b = true;
                digits[i] += 1;
                break;
            } else {
                b = false;
                digits[i] = 0;
            }
        }
        if (!b) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            for (int i = 1; i < ans.length; i++) {
                ans[i] = digits[i - 1];
            }
            return ans;
        }
        return digits;
    }
}