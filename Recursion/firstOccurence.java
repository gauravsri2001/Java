import java.util.*;
public class firstOccurence {
    public static int firstOccured (int num[], int key, int i){
        if(i == num.length){ //base case
            return -1;
        }
        
        if(num[i] == key){
            return i;
        }
        return firstOccured(num, key, i+1);
    }
    public static void main(String[] args) {
        int num[] = {5,9,6,3,8,6,7};
        System.out.println(firstOccured(num, 6, 0));
    }
}
