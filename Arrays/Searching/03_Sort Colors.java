// LC 75. Sort Colors

// 0s --> 0 to low-1
// 1s --> low to mid-1
// 2s --> high to n-1

class Solution {
    public void sortColors(int[] nums) {
        int m = 0;
        int h = nums.length-1;
        int l = 0;

        while(m<=h){
            if(nums[m]==0){
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;
                h--;
            }
        }
    }
}
