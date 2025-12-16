// LC 075

class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];

        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }

        int j = 0;
        int k = 0;
        while(j<nums.length){
            if(count[k]>0){
                nums[j] = k;
                count[k]--;
            j++;
            }
            if(count[k]==0) k++;
        }
    }
}
