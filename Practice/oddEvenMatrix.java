import java.util.*;
public class oddEvenMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();

            
        }
        for(int i = 0; i<n; i++){
            if(i%2==0){
                even.add(arr[i]);
    
            }else{
                odd.add(arr[i]);
            }
        }
        
        Collections.sort(even);
        Collections.sort(odd);

        for(int i=0; i<even.size(); i++ ){
            System.out.print(even.get(i)+" ");
        }
        System.out.println();

        for(int i=0; i<odd.size(); i++ ){
            System.out.print(odd.get(i)+" ");
        }
        System.out.println();

        int evenSec = even.get(even.size()-2);
        int oddSec = odd.get(odd.size()-2);

        int sum = evenSec + oddSec;

        System.out.println("Sum is " + sum);




    }
}
