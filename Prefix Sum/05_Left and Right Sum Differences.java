// LC 2574. Left and Right Sum Differences

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] l = new int[n];
        int[] r = new int[n];

        int preSum = 0;
        int sufSum = 0;
        int i = 0;
        int j = n-1;

        while(i<n){
            preSum += nums[i];
            sufSum += nums[j];
            
            l[i] = preSum;
            r[j] = sufSum;

            i++;
            j--;
        }

        int[] answer = new int[n];

        for(int k=0; k<n; k++){
            answer[k] = Math.abs(l[k]-r[k]);
        }
        return answer;
    }
}
