package Arr;

public class BinarySearch {

    public static int BinarySrc(int arr[],int key){
        int si = 0;
        int ei = arr.length-1;
        
         while (si <= ei) {

            int mid = si + (ei - si) / 2;

            if (key == arr[mid]) {
                return mid;
            }
            else if (key > arr[mid]) {
                si = mid + 1;
            }
            else {
                ei = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 5;

        int ans = BinarySrc(arr,key);

        if(ans== -1){
            System.out.println("key is not in array");
        }
        else{
            System.out.println("Key at index " + ans);
        }
    }
}
