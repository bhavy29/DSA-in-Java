class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int curr = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                curr++;
            }
            else{
                max = Math.max(curr,max);
                curr = 0;
            }
        }
        return Math.max(max,curr);
    }
}
