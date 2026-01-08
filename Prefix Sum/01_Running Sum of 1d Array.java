// LC 1480. Running Sum of 1d Array

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        
        for(int i=1; i<n; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}

// class Solution {
//     public int[] runningSum(int[] nums) {
//         int n = nums.length;
//         int[] runningSum = new int[n];
//         int sum = 0;
        
//         for(int i=0; i<n; i++){
//             runningSum[i] = sum + nums[i];
//             sum = runningSum[i];
//         }
//         return runningSum;
//     }
// }
