import java.util.*;
public class findPriceByMultiplyingDigits {
    public static int findPrice(int n){
        int price = 1;
        while(n%10!=0){
            int e = n%10;
            price *= e;
            n = n/10;

        }
        return price;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        int n = sc.nextInt();
        int price = findPrice(n);
        System.out.println(findPrice(n));

    }
}
