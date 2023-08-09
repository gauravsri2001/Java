import java.util.*;
public class greatestElement {
    public static void findElement(int[] arr){
        
        if(arr.length ==0){
            System.out.println("Empty array");
            return;
        }
        int idx=0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            
            if(arr[i]>max){
                max = arr[i];
                idx = i;
            }
        }
        System.out.println("Largest element " + max);
        System.out.println("idx no:- " + idx);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        findElement(arr);
    }
}
