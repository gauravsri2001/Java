import java.util.*;
public class leftRotateArrayby_D_places {
    public static void reverse(int arr[], int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }

    public static void rotateArray(int arr[], int n, int d){

        d = d % n;

        // Rotate the elements
        reverse(arr, 0, n-1);
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n=6;
        int d = 3;
        rotateArray(arr, n,d);
    }
}
