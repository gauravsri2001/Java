import java.util.*;
public class tilingProblem {
    public static int totalWays(int n){ // n = one size of floor

        if(n==0 || n==1){
            return 1;
        }
        int placeVertically = totalWays(n-1);

        int placeHorizontally = totalWays(n-2);

        int total = placeVertically + placeHorizontally;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(totalWays(6));
    }
}
