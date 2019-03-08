class Solution {
    public int lengthOfLastWord(String s) {
        int curr = 0, last = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                curr += 1;
            } else {
                if (curr != 0) {
                    last = curr;
                }
                curr = 0;
            }
        }
        return curr == 0 ? last : curr;
    }
}