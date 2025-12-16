// LC 392

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // for t
        int j = 0; // for j

        while(i<t.length() && j<s.length()){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
            i++;
        }
        if(j<s.length()){
            return false;
        }
        return true;
    }
}
