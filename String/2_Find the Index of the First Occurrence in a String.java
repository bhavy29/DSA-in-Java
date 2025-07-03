// LeetCode Find the Index of the First Occurrence in a String
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        // Only loop while i + m <= n to avoid index out of bounds
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}

// -----------------------------OR--------------------------
class Solution1 {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
