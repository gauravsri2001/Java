import java.util.*;

public class diagonalSum {
    public static int findSum(int[][] mat) {
        int sum = 0;
        
        for (int i = 0; i < mat.length; i++) {
            // Primary diagonal
            sum += mat[i][i];

            // Secondary diagonal
            if (i != mat.length - 1 - i) { // i != j
                sum += mat[i][mat.length - i - 1];
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        
        int diagonalSum = findSum(mat);
        System.out.println("Diagonal Sum: " + diagonalSum);
    }
}
