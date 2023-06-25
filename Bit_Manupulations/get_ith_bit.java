import java.util.*;
public class get_ith_bit {
    public static int getIthbit(int n , int i){
        int bitMask = 1<<i;
        if((n  & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthbit(5, 3));
    }
}
