//  LeetCode 1456

class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = 0;

        // create window
        while(j-i+1<=k){
            if(isVowel(s.charAt(j))){
                sum++;
            }
            j++;
        }
        max = Math.max(sum,max);

        // sliding the window
        while(j<n){
            if(isVowel(s.charAt(i))){
                sum--;
            }
            if(isVowel(s.charAt(j))){
                sum++;
            }
            max = Math.max(sum,max);
            i++;
            j++;
        }
        return max;

    }
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
