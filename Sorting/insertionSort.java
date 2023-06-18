package Sorting;

import java.util.*;
public class insertionSort {
    public static void sorting(int num[]){
        for(int i =1; i<num.length; i++){
            int curr = num[i];
            int prev = i-1;

            //finding the correct position
            while(prev>=0 && num[prev]>curr){
                num[prev+1] = num[prev];
                prev--;
            }
            //insertion
            num[prev+1] = curr;
        }
        
    }
    public static void printnum(int num[]) {
            for(int i =0; i<num.length; i++){
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }

    public static void main(String[] args) {
        int num[] = {5,4,1,3,2};
        sorting(num);
        printnum(num);
        
    }
    
}
