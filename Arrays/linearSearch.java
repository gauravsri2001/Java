import java.util.*;
public class linearSearch {

    public static int searchNum(int num[],int key ){
        for(int i=0; i<=num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int num [] = {2,6,8,6,85,35};
        int key = 6;

        //calling function
        int index = searchNum(num, key);
        if(index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("found at index " + index);
        }
    }
    
}
