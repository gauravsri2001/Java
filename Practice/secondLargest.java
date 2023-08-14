import java.util.*;

public class secondLargest {
    public static int findSecondLargest(int arr[]) {
        int n = arr.length;
        if (n < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int sec_Largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                sec_Largest = largest;
                largest = arr[i];
            } else if (arr[i] > sec_Largest && arr[i] != largest) {
                sec_Largest = arr[i];
            }
        }
        return sec_Largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findSecondLargest(arr));
    }
}
