class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap<Character, List<Integer>> map = new HashMap();
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.get(c).add(i);
            } else {
                List<Integer> lst = new ArrayList<Integer>();
                lst.add(i);
                map.put(c, lst);
                n++;
            }
        }
        
        HashMap<Character, Integer> tmap = new HashMap();
        for (List<Integer> lst : map.values()) {
            char c = t.charAt(lst.get(0));
            if (tmap.containsKey(c)) return false;
            tmap.put(c, 1);
            for (int i = 1; i < lst.size(); i++) {
                if (c != t.charAt(lst.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}