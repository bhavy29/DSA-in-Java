// LC 523. Continuous Subarray Sum

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);

        int preSum = 0;

        for(int i=0; i<nums.length; i++){
            preSum += nums[i];

            if(mp.containsKey(preSum % k)){
                if((i - mp.get(preSum%k)) > 1){
                    return true;
                }
            }
            else{
                mp.put(preSum%k,i);
            }
        }
        return false;
    }
}
