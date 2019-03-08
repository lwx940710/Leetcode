class Solution {
    public int numDecodings(String s) {
        int last = 1;
        if (s.length() == 0) return last;
        
        int secondLast = (s.charAt(s.length() - 1) == '0' ? 0 : 1);
        int curr = secondLast;
        for (int i = s.length() - 2; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                curr = 0;
                last = secondLast;
                secondLast = curr;
                continue;
            };
            int num = Integer.parseInt(s.substring(i, i + 2));
            if (num >= 1 && num <= 26) {
                curr = secondLast + last;
            } else {
                curr = secondLast;
            }
            last = secondLast;
            secondLast = curr;
        }
        return curr;
    }
}