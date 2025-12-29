// LC 713. Subarray Product Less Than K

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length() - 1;

        Map<Character, Integer> mp = new HashMap<>();
        int i = 0;
        int j = 0;
        int count = 0;

        // Create a window
        while (j <= n) {
            if (mp.containsKey(s.charAt(j))) {
                break;        // ----------------------> Problem
            }
            mp.put(s.charAt(j), j);
            count++;
            j++;
        }
        int max = count;

        // Slide 
        while (j <= n) {
            if (mp.containsKey(s.charAt(j))) {
                i = mp.get(s.charAt(j)) + 1;

                mp.put(s.charAt(j), j);
                count = j - i + 1;
                
            }
            // if(!mp.containsKey(s.charAt(j))){
            else {
                mp.put(s.charAt(j), j);
                count++;
               
            }
             if (count > max)
                    max = count;
                j++;
        }
        return max;
    }
}
