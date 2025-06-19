class Solution {
    public int secondLargestElement(int[] nums) {
        int n = nums.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(nums[i]>first){
                second = first;
                first = nums[i];
            }
            else if(second>nums[i] && nums[i]<first){
                second = nums[i];
            }
        }
        if(second == Integer.MIN_VALUE){
            return -1;
        }
        return second;
    }
}
