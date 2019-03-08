class Solution {
    public List<String> generateParenthesis(int n) {
        HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
        ArrayList<String> sol1 = new ArrayList<String>();
        sol1.add("()");
        map.put(1, sol1);
        
        for (int i = 2; i <= n; i++) {
            ArrayList<String> pre = map.get(i - 1);
            ArrayList<String> curr = new ArrayList<String>();
            for (int j = 0; j < pre.size(); j++) {
                String s = pre.get(j);
                String newStr = "#";
                for (int k = 0; k < s.length(); k++) {
                    newStr += s.charAt(k);
                    newStr += "#";
                }
                for (int k = 0; k < newStr.length(); k++) {
                    if (newStr.charAt(k) == '#') {
                        String temp = newStr.substring(0, k) + "()" + newStr.substring(k + 1);
                        String newTemp = "";
                        for (int m = 0; m < temp.length(); m++) {
                            if (temp.charAt(m) != '#') {
                                newTemp += temp.charAt(m);
                            }
                        }
                        if (!curr.contains(newTemp)) {
                            curr.add(newTemp);
                        }
                    }
                }
            }
            map.put(i, curr);
        }
        return map.get(n);
    }
}