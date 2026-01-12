// LC 974. Subarray Sums Divisible by K

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);

        int ans = 0;
        int preSum = 0;

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];

            int rem = preSum%k;
            // Convert neg rem to pos rem
            if(rem<0){
                rem = rem%k + k;
            }
            if(mp.containsKey(rem)){
                ans += mp.get(rem);
            }
            mp.put(rem, mp.getOrDefault(rem, 0) + 1);
        }
        return ans;
    }
}


//------------------------------

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] mp = new int[k];
        mp[0] = 1;

        int ans = 0;
        int preSum = 0;

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];

            int rem = preSum%k;
            // Convert neg rem to pos rem
            if(rem<0){
                rem = rem%k + k;
            }
                ans += mp[rem];

            mp[rem]++;
        }
        return ans;
    }
}
