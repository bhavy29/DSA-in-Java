// LC 482. License Key Formatting

class Solution {
    public String licenseKeyFormatting(String s, int k) {

        // s = s.replace("-", "");
        // s = s.toUpperCase();
        // int count = 0;
        // int i = s.length() - 1;
        // String a = "";

        // while (i >= 0) {
        //     if (count == k) {
        //         a = a + '-';
        //         count = 0;
        //     }
        //     a = a + s.charAt(i);
        //     count++;
        //     i--;
        // }
        // String reversed = new StringBuilder(a).reverse().toString();
        // return reversed;

        s = s.replace("-","").toUpperCase();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int i = s.length() - 1;

        while(i>=0){
            if(count==k){
                sb.append('-');
                count = 0;
            }
            sb.append(s.charAt(i));
            count++;
            i--;
        }
        return sb.reverse().toString();

    }
}
