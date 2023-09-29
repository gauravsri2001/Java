import java.util.*;
public class RomanToInteger {
    public static int convertToInteger(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        
        int prevVal = 0;
        int result = 0;
        for(int i = str.length()-1; i>=0; i--){
            int curVal = map.get(str.charAt(i));
            if(curVal<prevVal){
                result -= curVal;
            }else{
                result += curVal;
            }
            prevVal = curVal;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        int ans = convertToInteger(str);
        System.out.println(ans);

    }
}
