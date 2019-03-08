class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if (len == 0) return false;
        HashMap<Integer, Boolean> map = new HashMap();
        map.put(0, true);
        for (int i = 1; i < len; i++) {
            map.put(i, false);
        }
        for (int i = 0; i < len; i++) {
            if (!map.get(i)) continue;
            int n = nums[i];
            for (int j = 1; j <= n; j++) {
                if (i + j < len) {
                    map.put(i + j, true);
                }
            }
        }
        return map.get(len - 1);
    }
}