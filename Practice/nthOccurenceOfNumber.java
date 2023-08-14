import java.util.*;

public class nthOccurenceOfNumber {
    public static int findOccurence(int arr[], int k, int o) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                count++;
                if (count == o) {
                    return i;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int o = sc.nextInt();
        System.out.println(findOccurence(arr, k, o));
    }
}
