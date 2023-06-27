import java.util.*;
public class clearLast_I_bits {
    public static int clearBits(int n, int i){
        int bitMask = ~(0)<<i;
        int result = n & bitMask;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(clearBits(15, 2));
    }
}
