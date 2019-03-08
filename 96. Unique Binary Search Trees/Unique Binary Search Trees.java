class Solution {
    /* Recursively */
    /*
    public int numTrees(int n) {
        return buildTrees(1, n);
    }
    
    private int buildTrees(int i, int j) {
        if (i >= j) return 1;
        
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += buildTrees(i, k - 1) * buildTrees(k + 1, j);
        }
        return sum;
    }
    */
    
    /* Iteratively DP */
    public int numTrees(int n) {
        if (n == 0) return 1;
        int[] ans = new int[n + 1];
        ans[0] = 1;
        ans[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                ans[i] += ans[j - 1] * ans[i - j];
            }
        }
        return ans[n];
    }
}