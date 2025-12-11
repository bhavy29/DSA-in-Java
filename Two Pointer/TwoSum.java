// LC-01

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> TwoSumHash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (TwoSumHash.containsKey(diff)) {
                return new int[] { TwoSumHash.get(diff), i };
            }
            TwoSumHash.put(nums[i], i);
        }
        return null;
    }
}
