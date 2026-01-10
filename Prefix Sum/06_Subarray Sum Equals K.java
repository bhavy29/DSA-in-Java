// 560. Subarray Sum Equals K

class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        int preSum = 0;

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];

            if (mp.containsKey(preSum - k)) {
                ans += mp.get(preSum - k); // -------------------> IMP
            }
            mp.put(preSum, mp.getOrDefault(preSum, 0) + 1);
        }

        return ans;
    }
}
