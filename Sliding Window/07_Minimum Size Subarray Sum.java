// LC 209. Minimum Size Subarray Sum

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length-1;
        int sum = 0;
        int i = 0;
        int j = 0;

        // Create a window 
        while(sum<target && j<=n){
            sum = sum + nums[j];
            j++;
        }
        int minAns = j-i;

        if(sum<target) return 0;

        // Slide the window 
        while(j<=n ){
            sum = sum - nums[i];
            i++;
            if(sum>=target && minAns>(j-i)){
                minAns = j-i;
            }

            if(sum<target){
                sum += nums[j];
                j++;
            }
        }

        // If j==n and i<=n
        while(i<=n){
            sum = sum - nums[i];
            i++;
            if(sum>=target && minAns>(j-i)){
                minAns = j-i;
            }
        }
        return minAns;
    }
}
