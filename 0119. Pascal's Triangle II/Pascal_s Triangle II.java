class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> curr = new ArrayList<Integer>();
            curr.add(pre.get(0));
            for (int j = 1; j < i; j++) {
                curr.add(pre.get(j - 1) + pre.get(j));
            }
            curr.add(pre.get(i - 1));
            pre = curr;
        }
        return pre;
    }
}