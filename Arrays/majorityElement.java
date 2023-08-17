import java.util.*;

public class majorityElement {
    public static int findElement(int arr[]) {
        int n = arr.length;
        int count = 0;
        int ansIndex = 0;
        
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                ansIndex = arr[i];
                count = 1;
            } else {
                if (arr[i] == ansIndex) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        
        return ansIndex;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int majority = findElement(arr); // Call the function and store the result
        System.out.println(majority); // Print the majority element
    }
}
