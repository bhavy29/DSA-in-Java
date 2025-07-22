/*
Given an array arr[]  and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.
*/

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        
        int i = 0;
        int j = 0;
        
        while(j<n){
            // calculation
            if(arr[j]<0){
                dq.addLast(arr[j]); // This adds to the BACK of the deque

            }
        
            // create a window 
            if(j-i+1<k){
                j++;
            }
            
            // if k hits
            else if(j-i+1==k){
                if(!dq.isEmpty()){
                    result.add(dq.peekFirst());
                }
                else{
                    result.add(0);
                }
                // remove front element which will not help us in future.
                if(!dq.isEmpty() && arr[i] == dq.peekFirst()){
                    dq.pollFirst();
                }
                i++;
                j++;
            }
        }
         return result;
    }
}
