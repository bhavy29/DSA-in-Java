// LeetCode 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        float sum = 0;
        float avg = 0;
        int i = 0;
        int j = 0;
        int ans = 0;

        while (j < k) {
            sum = sum + arr[j];
            j++;
        }

        avg = sum / k;
        if (avg >= threshold) {
            ans++;
        }

        while (j < n) {
            sum = sum + arr[j] - arr[i];
            avg = sum / k;
            if (avg >= threshold) {
                ans++;
            }i++;
            j++;
        }

        return ans;
    }
}
