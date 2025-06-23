class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int insert = 0;

        for(int i=1; i<n; i++){
            if(nums[insert]==nums[i]){
                continue;
            }
            else{
                insert++;
                nums[insert] = nums[i];
            }
        }
        return insert+1;
    }
}
