// LeetCode 977. Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int i = 0;               // pointer to first non-negative number
        while (i < n && nums[i] < 0) {
            i++;
        }

        int j = i - 1;           // pointer to last negative number
        int k = 0;

        while (j >= 0 && i < n) {
            if (Math.abs(nums[j]) < nums[i]) {
                ans[k++] = nums[j] * nums[j];
                j--;
            } else {
                ans[k++] = nums[i] * nums[i];
                i++;
            }
        }

        // Add remaining negative squares
        while (j >= 0) {
            ans[k++] = nums[j] * nums[j];
            j--;
        }

        // Add remaining positive squares
        while (i < n) {
            ans[k++] = nums[i] * nums[i];
            i++;
        }

        return ans;
    }
}
