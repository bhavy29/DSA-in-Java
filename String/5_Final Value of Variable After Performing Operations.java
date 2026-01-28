// LC 2011. Final Value of Variable After Performing Operations

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        // int x = 0;
        // for(int i=0; i<operations.length; i++){
        //     if(operations[i].equals("X++") || operations[i].equals("++X")) x++;
        //     else x--;
        // }
        // return x;

        int x = 0;
        for(String i:operations){
            if(i.charAt(1)=='+') x++;
            else x--;
        }
        return x;
    }
}
