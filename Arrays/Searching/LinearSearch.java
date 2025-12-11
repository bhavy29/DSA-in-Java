
// Linear Search - O(n)

public class LinearSearch {

    public static int LinearSrc(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {13,21,43,14,90,32,42,21};
        int key = 43;

        int ans = LinearSrc(arr, key);
        if(ans== -1){
            System.out.println("key is not in array");
        }
        else{
            System.out.println("Key at index " + ans);
        }
    }
}
