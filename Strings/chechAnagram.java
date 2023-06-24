import java.util.*;
public class chechAnagram {
    public static boolean anagramCheck (String str1, String str2){
        String a = str1.toLowerCase();
        String b = str2.toLowerCase();

        if(a.length() == b.length()){
            char[] a1 = a.toCharArray();
            char[] b1 = b.toCharArray();

            Arrays.sort(a1);
            Arrays.sort(b1);

            boolean result = Arrays.equals(a1, b1);
            if(result){
                return true;
            }
            else{
                return false;
            }

        }
        else{
            return false;
        }

        
    }
    public static void main(String[] args) {
        String str1 = "heelo";
        String str2 = "eehlo";
        System.out.println(anagramCheck(str1, str2));
    }
}

