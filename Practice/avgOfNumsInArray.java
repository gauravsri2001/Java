import java.util.*;
public class avgOfNumsInArray {
    public static int calAvg(int nums[]){
        int n = nums.length;
        int count =0;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(nums[i]%3==0 && nums[i]%2==0){
                sum += nums[i];
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        int result = sum/count;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int result = calAvg(nums);
        System.out.println(result);
    }
}
