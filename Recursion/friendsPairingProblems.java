import java.util.*;
public class friendsPairingProblems {
    public static int pairingWays(int n){
        if(n==1 || n ==2){
            return n;
        }

        //Choices

        //Stay Single
        int c1 = pairingWays(n-1);

        //In pair

        int pc = (n-1);
        int c2TotalWays = (n-1) * pairingWays(n-2);

        int totalWays = c1 + c2TotalWays;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(pairingWays(6569));
    }
}
