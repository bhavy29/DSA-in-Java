// LC 724. Find Pivot Index

class Solution {
    public int pivotIndex(int[] nums) {
        // Prefix Sum
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }

        if(nums[0]==nums[nums.length-1]){
            return 0;
        }

        int j = 1;
        while(j<nums.length){
            if(nums[j-1]==nums[nums.length-1]-nums[j]){
                return j;
            }
            j++;
        }
        return -1;
    }
}
