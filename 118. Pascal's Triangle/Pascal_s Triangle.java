class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return result;
        }
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        row1.add(1);
        result.add(row1);
        List<Integer> preRow = row1;
        for (int i = 2; i <= numRows; i++) {
            List<Integer> currRow = new ArrayList<Integer>();
            currRow.add(preRow.get(0));
            for (int j = 1; j < i - 1; j++) {
                currRow.add(preRow.get(j - 1) + preRow.get(j)); 
            }
            currRow.add(preRow.get(i - 2));
            result.add(currRow);
            preRow = currRow;
        }
        return result;
    }
}