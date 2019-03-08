class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int i = 0, j = nums.length - 1;
        int[] ans = {-1, -1};
        if (nums == null || nums.length == 0) {
            return ans;
        }
        
        // find first occurance
        while (i < j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] >= target) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }
        if (nums[i] == target) {
            ans[0] = i;
        } else {
            return ans;
        }
        
        j = nums.length - 1;
        while (i < j) {
            int mid = i + (j - i) / 2 + 1;
            if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid;
            }
        }
        if (nums[j] == target) {
            ans[1] = j;
        }
        return ans;
    }
}

