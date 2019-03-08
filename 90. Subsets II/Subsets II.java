class Solution {
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        if (nums == null || nums.length == 0) return new ArrayList();
        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList();
        List<Integer> lst = new ArrayList();
        loop(ans, lst, 0, nums);
        return ans;
    }
    
    private void loop(List<List<Integer>> ans, List<Integer> lst, int index, int[] nums) {
        
        if (index <= nums.length) ans.add(lst);
        
        while (index < nums.length) {
            lst.add(nums[index]);
            loop(ans, new ArrayList<>(lst), index + 1, nums);
            lst.remove(lst.size() - 1);
            index++;
            while (index < nums.length && nums[index] == nums[index - 1]) {
                index++;
            }
        }
    } 
}