import java.util.*;
public class palindromeString {
    public static boolean isPalindrome(String str){
        String ns = str.toLowerCase().replaceAll("[^a-z0-9]","");

        for(int i=0; i<ns.length()/2; i++){
            if(ns.charAt(i) != ns.charAt(ns.length()-1-i)){
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        String str = "race a car";
        System.out.println(isPalindrome(str));
    }
}
