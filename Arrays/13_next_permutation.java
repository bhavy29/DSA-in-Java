class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pi = -1;

        // find pivot ele
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                pi = i;
                break;
            }
        }
        if(pi==-1){
            int i=0;
            int j = n-1;
            while(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        return;
        }

        // swap pi and just bigger ele
        for(int i=n-1; i>pi; i--){
            if(nums[i]>nums[pi]){
                int temp = nums[pi];
                nums[pi] = nums[i];
                nums[i] = temp;
            break;
            }
        }

        // reverse 
        int i = pi+1;
        int j = n-1;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
