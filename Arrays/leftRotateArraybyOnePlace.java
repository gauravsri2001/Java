import java.util.*;
public class leftRotateArraybyOnePlace {
    public static void rotateArray(int num[]){
        int temp = num[0];

        for(int i=1; i<num.length; i++){
            num[i-1] = num[i];
        }
        num[num.length-1] = temp;
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
        
    }
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5};
        rotateArray(num);
    }
}


