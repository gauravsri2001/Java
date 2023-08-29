import java.util.*;
public class NextGreaterElementOnRight {
    public static void nextGreater(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int ng[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ng[i] = -1;
            } else {
                ng[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for (int i = 0; i < ng.length; i++) {
            System.out.print(ng[i] + " "); 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        nextGreater(arr);
    }
}
