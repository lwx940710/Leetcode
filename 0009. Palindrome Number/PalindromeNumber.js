/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    var reverse = 0;
    if (x < 0) {
    	return false;
    } else if (x == 0) {
    	return true;
    } else {
    	var xx = x;
    	while (xx > 0) {
    		var n = xx % 10;
    		reverse = reverse * 10 + n;
    		xx = Math.floor(xx / 10);
    	}
    	if (reverse == x) {
    		return true;
    	} else {
    		return false;
    	}
    }
};
