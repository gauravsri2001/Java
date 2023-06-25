import java.util.*;
public class update_ith_bit {
    public static int updateIthbit(int n, int i, int nb){
        int bitMask = 1<<i;

        int clearBit = n & (~(bitMask));

        int setBit = n | bitMask;

        if(nb == 0){
            return clearBit;
        }else{
            return setBit;
        }
    }
    public static void main(String[] args) {
        System.out.println(updateIthbit(10, 2, 1));
    }
}
