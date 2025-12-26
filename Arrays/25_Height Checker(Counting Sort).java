// LC 1051. Height Checker

class Solution {
    public int heightChecker(int[] heights) {
        // Step 1 - Make new sorted array 
        int n = Integer.MIN_VALUE; // Size of counting sort
        int h = heights.length;

        for(int i=0; i<h; i++){
            if(heights[i]>n){
                n = heights[i];
            }
        }

        int[] arr = new int[n+1];

        // Step 2 - Fill values
        for(int i=0; i<h; i++){
            arr[heights[i]]++;
        }

        // Step 3 - Check
        int ans = 0;
        int i = 1; // for arr
        int j = 0; // for heights
        while(i<n+1){
            if(arr[i]!=0 && i!=heights[j]){
                ans++;
            }
            else if(arr[i]==0){
               i++; 
               continue; 
            } 
            arr[i]--;
            j++;
        }
        return ans;
    }
}
