class Solution {
    public int reverse(int x) {
        int result = 0, r = 0;
        while (x != 0) {
            r = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 
                || (result == Integer.MAX_VALUE / 10 && r > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 
                || (result == Integer.MIN_VALUE / 10 && r < -8)) {
                return 0;
            }
            result = result * 10 + r;
        }
        return result;
    }
}
