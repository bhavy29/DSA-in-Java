// LeetCode 643 Maximum Average Subarray I

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        double max = Integer.MIN_VALUE;
        double sum = 0;
        double avg = 0;

        // crate a window 
        while(j<k){
            sum = sum + nums[j];
            j++;
        }
        max = Math.max(max,sum/k);

        // sliding window 
        while(j<n){
            sum = sum - nums[i] + nums[j];
            max = Math.max(max,sum/k);
            i++;
            j++;
        }
        return max;
    }
}
