package Sorting;

import java.util.*;
public class countingSort {
    public static void sorting(int num[]){
        
        //Finding the range
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            largest = Math.max(largest, num[i]);
        }

        //Creating aa temporary array to store the frequencies of elemenst
        int count [] = new int[largest+1];
        for(int i=0; i<num.length; i++){
            count[num[i]]++; //counting the frequencies
        }

        //Sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                num[j] = i;
                j++;
                count[i]--; //subtracting the frequency from the count array
            }
        }

    }
    public static void printArray(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[] = {1,4,1,3,2,4,3,29};
        sorting(num);
        printArray(num);
    }
}
