package Sorting;

import java.util.*;
public class bubbleSort {
    public static void sorting(int num[]){
        for(int i=0; i<num.length-1; i++){
            for(int j = 0; j<num.length-1-i; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        
    }
    public static void printnum(int num[]) {
            for(int i =0; i<num.length; i++){
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        int num [] = {5,4,3,2,1};
        sorting(num);
        printnum(num);
    }
}
