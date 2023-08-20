import java.util.*;
public class replace0with1 {
    public static int replaceDigit(int n){
        int ans = 0;
        int temp = 1;
        if(n==0){
            return 1;
        }
        while(n>0){
            int d = n%10;
            if(d==0){
                d = 1;
            }
            ans = d * temp + ans;
            n = n/10;
            temp = temp*10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = replaceDigit(n);
        System.out.println(res);

    }
}
