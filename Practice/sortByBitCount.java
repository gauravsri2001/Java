import java.util.*;
import java.util.Comparator;
public class sortByBitCount{

    public static void sortBySetBitCount(Integer arr[]){
        Arrays.sort(arr, new Min());
    }
    public static class Min implements Comparator<Integer>{
        public int compare(Integer a, Integer b){
            int aa = Integer.bitCount(a);
            int bb = Integer.bitCount(b);
            if(aa>bb) return -1;
            else if(aa<bb) return 1;
            else return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Integer arr[] = new Integer[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sortBySetBitCount(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}