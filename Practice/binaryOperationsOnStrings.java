import java.util.*;
public class binaryOperationsOnStrings {
    public static int applyOperations(String str){
        int n = str.length();
        if(str==null){
            return -1;
        }
        int res = str.charAt(0) - '0';


        for(int i=1; i<n-1; i+=2){ //JUMP 2 PLACES
            if(str.charAt(i)=='A'){
                res = res & (str.charAt(i)-'0');
                i++;
            }else if(str.charAt(i) == 'B'){
                res = res | (str.charAt(i)-'0');
                i++;
            }else{
                res = res ^ (str.charAt(i)-'0');
                i++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(applyOperations(str));
    }
}
