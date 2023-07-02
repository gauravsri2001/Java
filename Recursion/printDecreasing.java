import java.util.*;
public class printDecreasing {
    public static void printNto1(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printNto1(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the number: ");
        int n = sc.nextInt();
        printNto1(n);
        
    }
}
