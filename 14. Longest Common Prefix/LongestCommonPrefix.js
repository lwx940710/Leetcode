/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
	if (strs.length == 0) return "";
    var min_length = Number.MAX_VALUE;
    for (var i = 0; i < strs.length; ++i) {
        if (strs[i].length < min_length) {
            min_length = strs[i].length;
        }
    }
    var prefix = "";
    for (var i = 0; i < min_length; ++i) {
        var c = strs[0][i];
        for (var j = 1; j < strs.length; ++j) {
            if (strs[j][i] !== c) {
                return prefix;
            }
        }
        prefix += c;
    }
    return prefix;
    
};
