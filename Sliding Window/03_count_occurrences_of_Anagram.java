class Solution {
    public static int countOcc(String s, String p) {
        Map<Character, Integer> mp = new HashMap<>();
        int ans = 0;

        // Storing occurrences of chars in p
        for (char x : p.toCharArray()) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }

        int i = 0, j = 0;
        int count = mp.size();  // number of unique chars to match
        int k = p.length();     // window size

        while (j < s.length()) {
            // calculation
            if (mp.containsKey(s.charAt(j))) {
                mp.put(s.charAt(j), mp.get(s.charAt(j)) - 1);
                if (mp.get(s.charAt(j)) == 0) {
                    count--;
                }
            }

            // Window length not achieved
            if (j - i + 1 < k) {
                j++;
            }
            // Window size matched
            else if (j - i + 1 == k) {
                if (count == 0) {
                    ans++;
                }

                // Before sliding, restore i-th character
                if (mp.containsKey(s.charAt(i))) {
                    if (mp.get(s.charAt(i)) == 0) {
                        count++;
                    }
                    mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
