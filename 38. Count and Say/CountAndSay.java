class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String s = countAndSay(n - 1);
        
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count += 1;
            } else {
                sb.append(count + "" + c);
                c = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count + "" + c);
        return sb.toString();
    }
}