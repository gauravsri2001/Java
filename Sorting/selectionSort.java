package Sorting;

import java.util.*;
public class selectionSort {
    public static void sorting(int num[]){
        for(int i=0; i<num.length-1; i++){
    
            int min = i; //initializing the min value

            for(int j= i+1; j<num.length;j++){
                if(num[j]<num[min]){
                    min = j;
                }
            }
            //swapping
            int temp = num[min];
            num[min] = num[i];
            num[i] = temp;
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
