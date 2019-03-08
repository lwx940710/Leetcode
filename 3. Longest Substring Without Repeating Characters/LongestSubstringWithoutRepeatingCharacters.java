class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int i = 0;
        for (int j = 0; j < length; ++j) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(i, map.get(s.charAt(j)));
            }
            max = Math.max(j - i + 1, max);
            map.put(s.charAt(j), j + 1);
        }
        return max;
    }
}