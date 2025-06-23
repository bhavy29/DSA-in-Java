class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        int f = 0;
        int s = 0;

        while(f<n1 && s<n2){
            if(nums1[f]<nums2[s]){
                ans.add(nums1[f]);
                f++;
            }
            else if(nums1[f]>nums2[s]){
                ans.add(nums2[s]);
                s++;
            }
            else if(nums1[f] == nums2[s]){
                ans.add(nums1[f]);
                f++;
                s++;
            }
        }
        while(f<n1){
            ans.add(nums1[f]);
                f++;
        }
        while(s<n2){
            ans.add(nums2[s]);
                s++;
        }
        
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
