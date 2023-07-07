import java.util.*;
public class x_to_power_n {
    public static int optimizedSolution(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimizedSolution(a, n/2);
        int result = halfPower * halfPower;

        //if n is odd
        if(n % 2 != 0){
            return a * result;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(optimizedSolution(5,3));
    }
}
