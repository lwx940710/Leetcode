class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(0);
        if (n == 0) return lst;
        
        int add = 1;
        for (int i = 0; i < n; i++) {
            int len = lst.size();
            for (int j = len - 1; j >= 0; j--) {
                lst.add(lst.get(j) + add);
            }
            add *= 2;
        }
        
        return lst;
    }
}