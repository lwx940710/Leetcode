class Solution {
    public String getPermutation(int n, int k) {
        int[] fac = new int[n + 1];
        fac[0] = 1;
        for (int i = 1; i <= n; i++) {
            fac[i] = fac[i - 1] * i;
        }
        
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        
        k--;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int index = k / fac[n - i];
            sb.append(String.valueOf(nums.get(index)));
            nums.remove(index);
            k = k % fac[n - i];
        }
        
        return sb.toString();
    }
    
}