class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        while (n != 1) {
            int sqrSum = 0;
            while (n != 0) {
                sqrSum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (set.contains(sqrSum)) {
                return false;
            }
            set.add(sqrSum);
            n = sqrSum;
        }
        return true;
    }
}