import java.util.*;
public class ratInHouse {
    public static int calculate(int arr[], int r, int unit){
        int sum = 0;
        int totalFood = r*unit;
        int count = 0;
        if(arr==null){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            count++;
            if(sum>=totalFood){
                break;
            }
        }
        if(sum<totalFood){
            return 0;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(calculate(arr, r, unit));
    }
}
