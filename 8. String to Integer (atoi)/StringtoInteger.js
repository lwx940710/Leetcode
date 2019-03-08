/**
 * @param {string} str
 * @return {number}
 */
var myAtoi = function(str) {
    var sign = 0;
    var num = 0;
    for (var i = 0; i < str.length; ++i) {
        if (sign == 0 && str[i] == ' ') {
            continue;
        } else {
            if (sign == 0 && str[i] == '+') {
                sign = 1;
            } else if (sign == 0 && str[i] == '-') {
                sign = -1;
            } else if (str[i] >= '0' && str[i] <= '9') {
                var n = parseInt(str[i]);
                if (sign == 0) sign = 1;
                num = num * 10 + n;
                if (num > 2147483647 && sign == 1) return 2147483647;
                if (num > 2147483647 && sign == -1) return -2147483648;
            } else {
                return sign * num;
            }
        }
    }
    return sign * num;
};
