class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List ans = new ArrayList<Integer>();
        
        if (matrix.length == 0) return ans;
        
        int rowFirst = 0, rowLast = matrix.length - 1;
        int colFirst = 0, colLast = matrix[0].length - 1;
        
        while (rowFirst <= rowLast && colFirst <= colLast) {
            for (int i = colFirst; i <= colLast; i++) {
                ans.add(matrix[rowFirst][i]);
            }
            for (int i = rowFirst + 1; i <= rowLast; i++) {
                ans.add(matrix[i][colLast]);
            }
            if (rowFirst < rowLast && colFirst < colLast) {
                for (int i = colLast - 1; i >= colFirst; i--) {
                    ans.add(matrix[rowLast][i]);
                }
                for (int i = rowLast - 1; i >= rowFirst + 1; i--) {
                    ans.add(matrix[i][colFirst]);
                }
            }
            rowFirst += 1;
            rowLast -= 1;
            colFirst += 1;
            colLast -= 1;
        }
        
        return ans;
    }
}