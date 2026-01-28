// LC 2089. Find Target Indices After Sorting Array

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // List<Integer> res= new ArrayList<>();
        // Arrays.sort(nums);
        
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==target) res.add(i);
        // }
        // return res;

        List<Integer> res= new ArrayList<>();
        int belowT = 0;
        int countT = 0;

        for(int i:nums){
            if(i<target) belowT++;
            else if(i==target) countT++;
        }

        for(int i=0; i< countT; i++){
            res.add(belowT + i);
        }
        return res;
    }
}
