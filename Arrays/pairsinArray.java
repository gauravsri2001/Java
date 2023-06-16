import java.util.*;
public class pairsinArray {
    public static void printPairs (int num[]){
        int totalPairs = 0;
        for(int i=0; i<num.length; i++){
            int curr = num[i]; //holds current value 2,4,6,8
            for (int j = i+1; j<num.length; j++){
                System.out.print("(" + curr + "," + num[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + totalPairs);
    }
    public static void main(String[] args) {
        int num [] = {2,4,6,8,10};
        printPairs(num);
    }
    
}
