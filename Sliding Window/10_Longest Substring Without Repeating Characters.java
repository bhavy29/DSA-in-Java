// LC 03 Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int max = 0;
        Map<Character,Integer> mp = new HashMap<>();

        while(r<s.length()){
            if(mp.containsKey(s.charAt(r))){
                l = Math.max(l,mp.get(s.charAt(r))+1);
            }
            
            mp.put(s.charAt(r),r);
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
