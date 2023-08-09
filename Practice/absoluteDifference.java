import java.util.*;
public class absoluteDifference {
    public static int findCount(int [] arr, int n, int num, int diff){
        int count = 0;
        n = arr.length;
        for(int i=0; i<n; i++){
            if(Math.abs(num-arr[i])<=diff){ //return absolute value
                count++;
            }
        }
        if(count>1){
            return count;
        }else{
            return -1;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int diff = sc.nextInt();
        System.out.println(findCount(arr, n, num, diff));
    }
}
