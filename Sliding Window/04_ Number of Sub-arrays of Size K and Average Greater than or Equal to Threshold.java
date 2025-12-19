// LC 1343  Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0;
        int i = 0;
        int j = 0;
        int n = arr.length;
        int sum = 0;

        while (j < n) {
            if (j < k) {
                sum += arr[j];
            } else {
                sum = sum - arr[i] + arr[j];
                i++;
            }
            int avg = sum / k;
            if ( (j-i==k-1) && (avg >= threshold)) {
                ans++;
            }
            j++;
        }

        return ans;
    }
}
