// //Convert the given string in the alternate lower case and upper case letters
import java.util.*;
public class lowerAndUpperCase {
    public static String alternateChange(String str){
       String ns="";
       for(int i =0; i<str.length(); i++){
        if(i%2==0){
           ns += Character.toLowerCase(str.charAt(i));
        }
        else{
            
            ns += Character.toUpperCase(str.charAt(i));
        }
    }
    return ns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ns = alternateChange(str);
        System.out.println(alternateChange(ns));
    }
}


