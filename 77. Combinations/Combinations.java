class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList();
        if (n == 0) {
            return ans;
        }
        if (n == k || k == 0) {
            List<Integer> nums = new ArrayList<Integer>();
            for (int i = 1; i <= k; i++) {
                nums.add(i);
            }
            ans.add(nums);
            return ans;
        }
        List<List<Integer>> lst = combine(n - 1, k - 1);
        for (List<Integer> l : lst) {
            l.add(n);
        }
        ans.addAll(lst);
        ans.addAll(combine(n - 1, k));
        return ans;
    }
}