class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if (strs.length == 0) return new ArrayList();
        
        HashMap<String, List> map = new HashMap();
        int[] count = new int[26];
        for (int i = 0; i < strs.length; i++) {
            Arrays.fill(count, 0);
            String word = strs[i];
            for (int j = 0; j < word.length(); j++) {
                count[word.charAt(j) - 'a']++;
            }
            
            String tmp = "";
            for (int j = 0; j < 26; j++) {
                tmp += "#" + count[j];
            }
            
            if (!map.containsKey(tmp)) {
                List<String> lst = new ArrayList();
                lst.add(word);
                map.put(tmp, lst);
            } else {
                map.get(tmp).add(word);
            }
        }
        
        return new ArrayList(map.values());
    }
}