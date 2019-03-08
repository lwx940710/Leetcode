class Solution {
    public boolean search(int[] nums, int target) {
        
        if (nums == null || nums.length == 0) return false;
        int lo = 0, hi = nums.length - 1;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[lo] < nums[mid]) { // nums[lo] ... nums[mid] is sorted
                if (target >= nums[lo] && target <= nums[mid]) { // target in first half
                    hi = mid;
                } else {
                    lo = mid + 1;
                }
            } else if (nums[mid] < nums[lo]) { // nums[mid] ... nums[hi] is sorted
                if (target >= nums[mid] && target <= nums[hi]) { // target in second half
                    lo = mid;
                } else {
                    hi = mid - 1;
                }
            } else {
                // nums[mid] == nums[lo]
                if (target == nums[mid]) {
                    return true;
                } else {
                    lo++;
                }
            }
        }
        return false;
    }
}