// LC 912 Merge Sort

class Solution {
 
    static void mergeSort(int[] nums, int si, int ei){
        if(si<ei){
        int mid = si + (ei-si)/2;
        mergeSort(nums,si,mid);
        mergeSort(nums,mid+1,ei);

        merge(nums,si,mid,ei);
        } 
    }

    static void merge(int[] nums,int si,int mid,int ei){
        int n1 = mid-si+1;
        int n2 = ei-mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0; i<n1; i++){
            L[i] = nums[si+i];
        }
        for(int j=0; j<n2; j++){
            R[j] = nums[mid+1+j];
        }

        int i=0; // left array
        int j=0; // right array
        int k = si; // for insertion in nums

        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                nums[k] = L[i];
                k++;
                i++;
            }
            else{
                nums[k] = R[j];
                k++;
                j++;
            }
        }

        while(i<n1){
            nums[k] = L[i];
            k++;
            i++;
        }
        
        while(j<n2){
            nums[k] = R[j];
            k++;
            j++;
        }

    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}
