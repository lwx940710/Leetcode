class Solution {
    public int[][] generateMatrix(int n) {
        int count = 1;
        int[][] matrix = new int[n][n];
        
        int rowFirst = 0, rowLast = n - 1;
        int colFirst = 0, colLast = n - 1;
        
        while (rowFirst <= rowLast && colFirst <= colLast) {
            for (int i = colFirst; i <= colLast; i++) {
                matrix[rowFirst][i] = count;
                count++;
            }
            for (int i = rowFirst + 1; i <= rowLast; i++) {
                matrix[i][colLast] = count;
                count++;
            }
            if (rowFirst < rowLast && colFirst < colLast) {
                for (int i = colLast - 1; i >= colFirst; i--) {
                    matrix[rowLast][i] = count;
                    count++;
                }
                for (int i = rowLast - 1; i >= rowFirst + 1; i--) {
                    matrix[i][colFirst] = count;
                    count++;
                }
            }
            
            rowFirst++;
            rowLast--;
            colFirst++;
            colLast--;
        }
        
        
        return matrix;
    }
}