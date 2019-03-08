class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m == 0) return 0;
        int n = obstacleGrid[0].length;
        int[][] paths = new int[m][n];
        
        boolean iBlock = false, jBlock = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    paths[i][j] = 0;
                    if (i == 0) {
                        iBlock = true;
                    }
                    if (j == 0) {
                        jBlock = true;
                    }
                } else if (i == 0) {
                    if (iBlock) {
                        paths[i][j] = 0;
                    } else {
                        paths[i][j] = 1;
                    }
                } else if (j == 0) {
                    if (jBlock) {
                        paths[i][j] = 0;
                    } else {
                        paths[i][j] = 1;
                    }
                } else {
                    paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
                }
            }
        }
        return paths[m - 1][n - 1];
    }
}