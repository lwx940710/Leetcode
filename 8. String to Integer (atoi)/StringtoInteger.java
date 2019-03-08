class Solution {
    public int myAtoi(String str) {
        int sign = 0;
        int num = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (sign == 0 && str.charAt(i) == ' ') {
                continue;
            } else {
                if (sign == 0 && str.charAt(i) == '+') {
                    sign = 1;
                } else if (sign == 0 && str.charAt(i) == '-') {
                    sign = -1;
                } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    int n = Integer.parseInt(Character.toString(str.charAt(i)));
                    if (sign == 0) sign = 1;
                    if (num > Integer.MAX_VALUE / 10 
                        || (num == Integer.MAX_VALUE / 10 && n > 7)
                        || num < Integer.MIN_VALUE / 10
                        || (num == Integer.MIN_VALUE / 10 && n < -8)) {
                        if (sign == 1) {
                            return Integer.MAX_VALUE;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    }
                    num = num * 10 + n;
                } else {
                    return sign * num;
                }
            }
        }
        return sign * num;
    }
}
