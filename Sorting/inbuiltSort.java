package Sorting;

import java.util.Arrays;

//Using Sort function

// import java.util.Arrays;
// public class inbuiltSort {
//     public static void printNum(int num[]) {
//             for(int i =0; i<num.length; i++){
//                 System.out.print(num[i] + " ");
//             }
//             System.out.println();
//         }
//     public static void main(String[] args) {
//         int num[] = {5,3,1,4,2};
//         //Arrays.sort(num);    //use this to sort the whole array

//         Arrays.sort(num, 0,3);  // use this to sort between specific indexes
//         printNum(num);
//     }
// }


//Using Collections

import java.util.Collections;
public class inbuiltSort{
    public static void printNum(Integer num[]) {
            for(int i =0; i<num.length; i++){
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        Integer num[] = {5,3,1,4,2}; // we have define the array as object because collections deals with objects
        //Arrays.sort(num,Collections.reverseOrder());
        Arrays.sort(num, 0,3,Collections.reverseOrder());
        printNum(num);
        
    }
}