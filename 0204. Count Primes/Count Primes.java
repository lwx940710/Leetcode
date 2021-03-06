class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        for (int i = 2; i < n; i++) {
            if (prime[i]) count++;
            for (int j = 2; j * i < n; j++) {
                prime[i * j] = false;
            }
        }
        return count;
    }
}