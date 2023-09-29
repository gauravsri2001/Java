import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        int temp = n;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        temp = n; // Reset temp to the original value of n

        while (temp != 0) {
            int rem = temp % 10;
            res = res + (int) Math.pow(rem, count);
            temp = temp / 10;
        }
        if (res == n) {
            System.out.println("Armstrong no");
        } else {
            System.out.println("not armstrong");
        }
    }
}
