/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    if (s == null || s.length < 1) return "";
    var start = 0, end = 0;
    for (var i = 0; i < s.length; ++i) {
        var l = Math.max(expandAroundCenter(s, i, i), expandAroundCenter(s, i, i + 1));
        if (l > end - start) {
            start = i - Math.floor((l - 1) / 2);
            end = i + Math.floor(l / 2);
        }
    }
    return s.substring(start, end + 1);
};

var expandAroundCenter = function(s, l, r) {
	while (l >= 0 && r < s.length && s[l] == s[r]) {
        l--;
        r++;
    }
    return r - l - 1;
};
