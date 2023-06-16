import java.util.*;
public class subArrays {
    public static void printSubarrays(int n[]){
        int total = 0;
    for(int i=0; i<n.length;i++){
        for(int j = i; j<n.length; j++){
            for(int k=i; k<=j; k++){
                System.out.print(n[k] + " ");
            
            }
            total++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("Toatal subarrays = " + total);
}
    public static void main(String[] args) {
        int n [] = {2,4,6,8,10};
        printSubarrays(n);
    }
}
