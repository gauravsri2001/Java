import java.util.*;
public class checkPowerOf2 {
    public static boolean checkPower(int n){
        return (n & (n-1) ) == 0;
    }
    public static void main(String[] args) {
        System.out.println(checkPower(0));
    }
}
