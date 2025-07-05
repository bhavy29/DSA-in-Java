//  LeetCode 1071. Greatest Common Divisor of Strings

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int ans = gcd(n1, n2);
        return str2.substring(0,ans);
    }
    
     public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
