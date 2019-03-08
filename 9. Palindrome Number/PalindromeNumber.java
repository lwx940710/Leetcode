class Solution {
    public boolean isPalindrome(int x) {
    	int reverse = 0;
        if (x < 0) {
        	return false;
        } else if (x == 0) {
        	return true;
        } else {
            int xx = x;
        	while (xx > 0) {
        		int n = xx % 10;
        		reverse = reverse * 10 + n;
        		xx /= 10;
        	}
        	if (reverse == x) {
        		return true;
        	} else {
        		return false;
        	}
        }
    }
}
