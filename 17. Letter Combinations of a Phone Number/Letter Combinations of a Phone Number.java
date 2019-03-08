class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<String>();
        }
        
        int len = digits.length();
        HashMap<Integer, String> dict = new HashMap<Integer, String>();
        
        ArrayList<String> pre = new ArrayList<String>();
        ArrayList<String> curr = new ArrayList<String>();
        
        dict.put(2, "abc");
        dict.put(3, "def");
        dict.put(4, "ghi");
        dict.put(5, "jkl");
        dict.put(6, "mno");
        dict.put(7, "pqrs");
        dict.put(8, "tuv");
        dict.put(9, "wxyz");
        
        int digit_0 = Integer.parseInt(Character.toString(digits.charAt(0)));
        for (int i = 0; i < dict.get(digit_0).length(); i++) {
            pre.add(Character.toString(dict.get(digit_0).charAt(i)));
        }
        curr = (ArrayList) pre.clone();
        
        for (int i = 1; i < len; i++) {
            curr.clear();
            int digit = Integer.parseInt(Character.toString(digits.charAt(i)));
            for (int j = 0; j < pre.size(); j++) {
                for (int k = 0; k < dict.get(digit).length(); k++) {
                    curr.add(pre.get(j) + dict.get(digit).charAt(k));
                }
            }
            pre = (ArrayList) curr.clone();
        }
        return curr;
    }
}