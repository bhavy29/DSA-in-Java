// LeetCode 605. Can Place Flowers

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;

        int i = 0;
        while(i<size && n>0){
        int emptyLeft = 0;
        int emptyRight = 0;
            if(flowerbed[i]==0){
                if(i==0 || flowerbed[i-1]==0){
                   emptyLeft = 1; 
                }
                if(i==size-1 || flowerbed[i+1]==0){
                   emptyRight = 1; 
                }
                if (emptyLeft==1 && emptyRight==1) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
            i++;
        }
        if(n==0) return true;
        return false;
    }
}
