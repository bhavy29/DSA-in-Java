// LC 34. Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f = -1;
        int si = 0;
        int ei = nums.length-1;

        while(si<=ei){
            int mid = si + (ei - si) / 2;

            if(nums[mid]==target){
                f = mid;
                ei = mid-1;  // IMP
            }
            else if(nums[mid]>target){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }

        if(f==-1) return new int[] {-1,-1};
        
        int l = f;
        
        while( l<nums.length && nums[l]==target ){
            l++;
        }
        return new int[]{f,l-1};
    }
}
