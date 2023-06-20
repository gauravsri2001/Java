import java.util.*;
public class searchinSortedMatrix {
    public static boolean searchKey(int mat[][], int key){
        int row = 0; int col = mat.length-1;
       
        while(row<mat.length && col >=0){
            if(mat[row][col]==key){
                System.out.println("Key found at index: ( " + row +","+col+")");
                return true;
            }
            else if(key<mat[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int mat [] [] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        searchKey(mat, 33);
        
    }
}
