import java.util.*;
public class sumOfUncommon {

    public static int findUncommon(int arr1[], int arr2[], int m, int n){
        m = arr1.length;
        n= arr2.length;

        //if both the arrays are null
        if(arr1==null && arr2==null){
            return -1;
        }
        
        //if only 1 array is null
        if(arr1==null){
            return sumArray(arr2);
        }

        if(arr2==null){
            return sumArray(arr1);
        }

        //find uncommon from both the arrays
        int sum = 0;
        for(int i =0; i<m; i++){
            int num = arr1[i];
            boolean isUncommon = true;

            for(int j = 0; j<n; j++){
                if(num==arr2[j]){
                    isUncommon = false;
                    break;
                }
            }

            if(isUncommon){
                sum += num;
            }
        }

        for(int i =0; i<n; i++){
            int num = arr2[i];
            boolean isUncommon = true;

            for(int j = 0; j<m; j++){
                if(num == arr1[j]){
                    isUncommon = false;
                    break;
                }
            }
            if(isUncommon){
                sum +=num;
            }
        }
        return sum;
    }

    private static int sumArray(int arr[]){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            int num = arr[i];
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        //creating the first array with size m
        int [] arr1 = new int[m]; 
        for(int i = 0; i<m; i++){
            arr1[i] = sc.nextInt();
        }

        //creating second array with size n
        int n = sc.nextInt();
        int [] arr2 = new int[n];
        for(int i =0; i<n ; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println(findUncommon(arr1, arr2, m, n));
        
    }
}

//optimized approach

// import java.util.*;

// public class sumOfUncommonOptimized {

//     public static int findUncommon(int arr1[], int arr2[]) {
//         if (arr1 == null && arr2 == null) {
//             return -1;
//         }

//         if (arr1 == null) {
//             return sumArray(arr2);
//         }

//         if (arr2 == null) {
//             return sumArray(arr1);
//         }

//         // Using hash sets to store elements of each array
//         Set<Integer> set1 = new HashSet<>();
//         Set<Integer> set2 = new HashSet<>();

//         // Adding elements of arr1 to set1
//         for (int num : arr1) {
//             set1.add(num);
//         }

//         // Adding elements of arr2 to set2
//         for (int num : arr2) {
//             set2.add(num);
//         }

//         int sum = 0;

//         // Checking for uncommon elements in arr1
//         for (int num : set1) {
//             if (!set2.contains(num)) {
//                 sum += num;
//             }
//         }

//         // Checking for uncommon elements in arr2
//         for (int num : set2) {
//             if (!set1.contains(num)) {
//                 sum += num;
//             }
//         }

//         return sum;
//     }

//     private static int sumArray(int arr[]) {
//         int sum = 0;
//         for (int num : arr) {
//             sum += num;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int m = sc.nextInt();

//         //creating the first array with size m
//         int[] arr1 = new int[m];
//         for (int i = 0; i < m; i++) {
//             arr1[i] = sc.nextInt();
//         }

//         //creating second array with size n
//         int n = sc.nextInt();
//         int[] arr2 = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr2[i] = sc.nextInt();
//         }

//         System.out.println(findUncommon(arr1, arr2));
//     }
// }
