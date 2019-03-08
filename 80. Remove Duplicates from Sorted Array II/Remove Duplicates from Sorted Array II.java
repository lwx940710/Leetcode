class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int ptr = 1;
        int count = 1;
        
        while (ptr < nums.length) {
            if (nums[ptr] == nums[ptr - 1]) {
                if (count < 2) {
                    count++;
                    nums[index] = nums[ptr];
                    index++;
                }
            } else {
                count = 1;
                nums[index] = nums[ptr];
                index++;
            }
            ptr++;
        }
        return index;
    }
}