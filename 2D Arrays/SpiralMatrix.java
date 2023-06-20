import java.util.*;
public class SpiralMatrix {
    public static void printSpiral(int nums [] []){
        int startRow = 0;
        int endRow = nums.length -1;
        int startColumn = 0;
        int endColumn = nums[0].length-1;

        while(startRow<=endRow && startColumn<=endColumn){

            //top row
            for(int i = startColumn ; i<= endColumn; i++){
                System.out.print(nums[startRow][i] + " ");
                
            }
            startRow++;

            //right column
            for(int i=startRow; i<=endRow; i++){
                System.out.print(nums[i][endColumn]+" ");
            }
            endColumn--;

            //bottom
            if (startRow<=endRow){
                for(int i = endColumn; i>=startColumn; i--){
                System.out.print(nums[endRow][i]+" ");
            }
            endRow--;
            }
            
            //left column
            if(startColumn<=endColumn){
                for(int i = endRow ; i>=startRow; i--){
                System.out.print(nums[i][startColumn]+" ");
            }
            startColumn++;
            }
            

        }
    }
    public static void main(String[] args) {
        int nums[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printSpiral(nums);
    }
}
