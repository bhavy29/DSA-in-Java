// 169. Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        int m = (nums.length)/2;
        Arrays.sort(nums);
        int n = nums[0];
        int count = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==n){
                count++;
                if(count > m ){
                    return nums[i];
                }
            }
            else{
                n = nums[i];
                count = 1;
            }
        }   
        return 0;
    }
}
