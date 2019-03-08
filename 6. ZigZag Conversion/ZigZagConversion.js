/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
    if (numRows == 1) return s;
    var currRow = 1;
    var down = true;
    var map = {};
    for (var i = 0; i < s.length; ++i) {
        if (map[currRow]) {
            map[currRow] = map[currRow] + s[i];
            if (down) {
                if (currRow == numRows) {
                    down = false;
                    currRow = numRows - 1;
                } else {
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
            map[currRow] = s.charAt(i);
            if (currRow == numRows) {
                down = false;
                currRow = numRows - 1;
            } else {
                currRow++;
            }
        }
    }
    var result = "";
    for (var i = 1; i <= numRows; ++i) {
        if (map[i]) {
            result += map[i];
        } else {
            break;
        }
    }
    return result;
};
