import java.util.*;
public class alphabetAndNumericStackCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> alpha = new Stack<>();
        Stack<Integer> num = new Stack<>();

        boolean isValid = true;

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(Character.isDigit(c)){
                int digit = Character.getNumericValue(c);+
                num.push(digit);
            }
            else if(Character.isAlphabetic(c)){
                alpha.push(c);
            }
            else{
                isValid = false;
                break;
                
            }
        }
        String rs = "";
        int n = 0;
        if(isValid){
            while(!alpha.isEmpty()){
                rs = alpha.pop() + rs;
            }
            System.out.println(rs);
            while(!num.isEmpty()){
                n = n * 10 + num.pop();
            }
            while(n!=0){
                System.out.println(n%10);
                n = n/10;
            }
        }
        else{
            System.out.println("Invalid");
        }

    }
}
