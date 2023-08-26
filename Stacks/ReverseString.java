import java.util.*;
public class ReverseString {
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder ns = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            ns.append(curr);
        }
        return ns.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        String result = reverse(str);
        System.out.println(result);
    }
}
