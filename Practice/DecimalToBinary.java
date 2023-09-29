import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bin = 0;
        int power = 0;

        while(n>0){
            int rem = n%2;
            bin = bin + (rem * (int)Math.pow(10, power));
            power++;
            n = n/2;
        }
        System.out.println(bin);
    }
}
