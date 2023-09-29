import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 0;
        int dec = 0;

        while(n>0){
            int ld = n%10;
            dec = dec + (ld * (int) Math.pow(2, power));
            power++;
            n = n/10;
        }
        System.out.println(dec);
    }
}
