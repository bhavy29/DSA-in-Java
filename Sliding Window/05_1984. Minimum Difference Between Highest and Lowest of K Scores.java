// LC 1984. Minimum Difference Between Highest and Lowest of K Scores

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        int minDiff = Integer.MAX_VALUE;

        if(nums.length==1){
            return 0;
        }

        while(j<nums.length){
             if (j - i + 1 == k) {
                minDiff = Math.min(minDiff, nums[j] - nums[i]);
                i++; 
            }
            j++;
        }
        return minDiff;
    }
}
