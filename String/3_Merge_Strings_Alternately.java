// LeetCode 1768. Merge Strings Alternately

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = new String();

        int n1 = word1.length();
        int n2 = word2.length();
        int turn = 0;

        int i = 0;
        int j = 0;
        while(i<n1 && j<n2){
            if(turn == 0){
                ans = ans + word1.charAt(i);
                i++;
                turn = 1;
            }
            else if(turn == 1){
                ans = ans + word2.charAt(j);
                j++;
                turn = 0;
            }
        }
        while(i<n1){
            ans = ans + word1.charAt(i);
            i++;
        }
        while(j<n2){
            ans = ans + word2.charAt(j);
            j++;
        }
        return ans;
    }
}


//----------------------------OR-------------------------

class Solution1 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();

        int i = 0, j = 0;
        int n1 = word1.length();
        int n2 = word2.length();

        while (i < n1 && j < n2) {
            ans.append(word1.charAt(i++));
            ans.append(word2.charAt(j++));
        }

        while (i < n1) {
            ans.append(word1.charAt(i++));
        }

        while (j < n2) {
            ans.append(word2.charAt(j++));
        }

        return ans.toString();
    }
}

