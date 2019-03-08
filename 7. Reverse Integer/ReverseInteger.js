/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
	var result = 0, r = 0;
    while (x != 0) {
        r = x % 10;
        if (x > 0) {
            x = Math.floor(x / 10);
        } else {
            x = Math.ceil(x / 10);
        }
        result = result * 10 + r;
    }
    if (result >= 2147483647 || result <= -2147483648) return 0;
    return result;
    
};
