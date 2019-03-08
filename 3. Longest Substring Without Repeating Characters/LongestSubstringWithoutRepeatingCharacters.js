/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    const length = s.length;
    var max = 0;
    var map = {};
    var i = 0;
    for (var j = 0; j < length; ++j) {
        if (s[j] in map) {
            i = Math.max(i, map[s[j]]);
        }
        max = Math.max(j - i + 1, max);
        map[s[j]] = j + 1;
    }
    return max;
};
