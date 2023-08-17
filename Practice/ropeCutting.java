import java.util.*;
public class ropeCutting {
    public static int maxPieces(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        } else if (n < 0) {
            return -1;
        }
        int temp1 = maxPieces(n - a, a, b, c);
        int temp2 = maxPieces(n - b, a, b, c);
        int temp3 = maxPieces(n - c, a, b, c);

        int pieces = Math.max(temp3, Math.max(temp1, temp2));
        if (pieces == -1) {
            return -1;
        } else {
            pieces = pieces + 1;
        }
        return pieces;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(maxPieces(n, a, b, c));
    }
}