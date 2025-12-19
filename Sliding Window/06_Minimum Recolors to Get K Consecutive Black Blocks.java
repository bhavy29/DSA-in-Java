// LC 2379. Minimum Recolors to Get K Consecutive Black Blocks

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int countW = 0;

        int i = 0;
        int j = 0;
        while (j < k) {
            if (blocks.charAt(j) == 'W') {
                countW++;
            }
            j++;
        }
        int min = countW;
        while (j < blocks.length()) {
            if (blocks.charAt(i) == 'W' && blocks.charAt(j) == 'B') {
                countW--;
            } else if(blocks.charAt(i) == 'B' && blocks.charAt(j) == 'W') {
                countW++;
            }
            min = Math.min(min, countW);
            i++;
            j++;
        }
        return min;
    }
}
