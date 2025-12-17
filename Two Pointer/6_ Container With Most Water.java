// LC 011

class Solution {
    public int maxArea(int[] height) {
        int max = 0;  
        int area = 0;
        int l = 0;
        int r = height.length-1;

        while(l<r){
            area = Math.min(height[l], height[r]) * ( r - l);
            if(max<area){
                max = area;
            }
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}
