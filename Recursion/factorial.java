import java.util.*;
public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        //int a = fact(n-1);
        int result = n * fact(n-1);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fact(n));
    }
}
