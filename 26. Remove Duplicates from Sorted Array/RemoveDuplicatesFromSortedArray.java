class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        // not removing duplicates
        // more like move all unique numbers to the first i + 1 places in the array
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i += 1;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}