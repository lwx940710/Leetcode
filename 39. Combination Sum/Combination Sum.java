class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        HashMap<Integer, List<List<Integer>>> map = new HashMap();
        Arrays.sort(candidates);
        for (int i = 0; i <= target; i++) {
            List<List<Integer>> comb = new ArrayList();
            for (int j = 0; j < candidates.length; j++) {
                if (i < candidates[j]) break;
                int diff = i - candidates[j];
                if (diff == 0) {
                    List<Integer> tmp = new ArrayList();
                    tmp.add(candidates[j]);
                    comb.add(tmp);
                } else {
                    if (map.containsKey(diff)) {
                        List<List<Integer>> diffComb = map.get(diff);
                        for (List<Integer> itr : diffComb) {
                            if (candidates[j] <= itr.get(0)) {
                                List<Integer> tmp = new ArrayList<Integer>();
                                tmp.add(candidates[j]);
                                tmp.addAll(itr);
                                comb.add(tmp);
                            }
                        }
                    }
                }
            }
            map.put(i, comb);
        }
        List<List<Integer>> ans = map.get(target);
        return ans;
    }
}