import java.util.*;

public class n_baseNotation {
    public static String DectoNBase(int n, int num) {
        ArrayList<Integer> rem = new ArrayList<Integer>();
        String res = "";
        int quotient = num / n;
        rem.add(num % n);
        while (quotient != 0) {
            rem.add(quotient % n);
            quotient = quotient / n;
        }
        Collections.reverse(rem);
        for (int i = 0; i < rem.size(); i++) {
            if (rem.get(i) > 9) {
                res = res + (char) (rem.get(i) - 10 + 'A');
            } else {
                res = res + rem.get(i);
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        System.out.println(DectoNBase(n, num));
    }
}
