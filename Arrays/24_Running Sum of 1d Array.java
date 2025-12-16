// LC 1480

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] runningSum = new int[n];
        int sum = 0;
        
        for(int i=0; i<n; i++){
            runningSum[i] = sum + nums[i];
            sum = runningSum[i];
        }
        return runningSum;
    }
}
