class Solution {
    public int largestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
}