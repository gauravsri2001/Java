
import java.util.*;
public class createFirst {
    public static void main(String[] args) {
        int arr [] [] = new int [3] [3];
        int row = arr.length;
        int column = arr[0].length;

        //taking input
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                arr [i] [j] = sc.nextInt();
            }
        }

        //printing the output
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(arr[i] [j] + " ");
            }
            System.out.println();
        }
    }
}
