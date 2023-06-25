import java.util.*;

public class clear_ith_bit {
    public static int cleatIthbit(int n, int i){
        int bitMask = ~(1<<i);

        return (n & bitMask);
    }
    public static void main(String[] args) {
     System.out.println(cleatIthbit(10, 1));   
    }
}
