import java.util.*;

public class fibonacciNumber {
    public static int fibo(int n){

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        

        int result = fibo(n-1) + fibo(n-2);
        return result;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibo(n));
    }
}
