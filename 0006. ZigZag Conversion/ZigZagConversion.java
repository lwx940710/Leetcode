class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int currRow = 1;
        Boolean down = true;
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 0; i < s.length(); ++i) {
            if (map.containsKey(currRow)) {
                map.put(currRow, map.get(currRow) + s.charAt(i));
                if (down) {
                    if (currRow == numRows) {
                        down = false;
                        currRow = numRows - 1;
                    }else {
                        currRow++;
                    }
                    
                } else {
                    if (currRow == 1) {
                        down = true;
                        currRow = 2;
                    } else {
                        currRow--;
                    }
                }
            } else {
                map.put(currRow, Character.toString(s.charAt(i)));
                if (currRow == numRows) {
                    down = false;
                    currRow = numRows - 1;
                } else {
                    currRow++;
                }
            }
        }
        String result = "";
        for (int i = 1; i <= numRows; ++i) {
            if (map.containsKey(i)) {
                result += map.get(i);
            } else {
                break;
            }
        }
        return result;
    }
}
