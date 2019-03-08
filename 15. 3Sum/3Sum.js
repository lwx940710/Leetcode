/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    var set = {};
    if (nums.length == 0) {
    	return set;
    }
    nums.sort();
    for (var i = 0; i < nums.length - 2; ++i) {
    	var j = i + 1;
    	var k = nums.length - 1;
    	while (j < k) {
    		var sum = nums[i] + nums[j] + nums[k];
    		if (sum == 0) {
    			set.psuh({nums[i], nums[j], nums[k]});
    			j++;
    			k--;
    		} else if (sum < 0) {
    			j++;
    		} else if (sum > 0) {
    			k--;
    		}
    	}
    }
    return set;
};
