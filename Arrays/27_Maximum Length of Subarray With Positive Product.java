// LC 1567. Maximum Length of Subarray With Positive Product

class Solution {
    public int getMaxLen(int[] nums) {

        int firstNeg = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                firstNeg = i;
                break;
            }
        }

        int i = 0;
        int j = 0;
        int ans = 0;
        double p = 1;
        boolean hit0 = false;

        while (j < nums.length) {
            p *= nums[j];

            if(nums[j]<0){
                if(hit0==true && firstNeg==-1 ){
                    firstNeg = j;
                }
            }

            if (p < 0) {
                ans = Math.max(ans, j - firstNeg);
            } else if (p > 0) {
                ans = Math.max(ans, j - i + 1);
            }

            if (nums[j] == 0) {
                p = 1;
                i = j + 1;
                firstNeg = -1;
                hit0 = true;
                // for (int k = j+1; k < nums.length; k++) {
                //     if (nums[k] < 0) {
                //         firstNeg = k;
                //         break;
                //     }
                // }
            }
            j++;
        }
        return ans;
    }
}
