class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        
        for (int i = 0; i < 9; i++) {
            for (int k = 1; k <= 9; k++) {
                map.put(k, false);
            }
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int n = Integer.parseInt(Character.toString(board[i][j]));
                    if (map.get(n)) {
                        return false;
                    } else {
                        map.put(n, true);
                    }
                }
            }
            
        }
        for (int j = 0; j < 9; j++) {
            for (int k = 1; k <= 9; k++) {
                map.put(k, false);
            }
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    int n = Integer.parseInt(Character.toString(board[i][j]));
                    if (map.get(n)) {
                        return false;
                    } else {
                        map.put(n, true);
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 1; k <= 9; k++) {
                    map.put(k, false);
                }
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        char c = board[x + i * 3][y + j * 3];
                        if (c != '.') {
                            int n = Integer.parseInt(Character.toString(c));
                            if (map.get(n)) {
                                return false;
                            } else {
                                map.put(n, true);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}