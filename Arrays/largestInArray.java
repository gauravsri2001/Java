import java.util.*;
public class largestInArray {
    public static int findLargest(int nums[]){
        int largest = Integer.MIN_VALUE; // negative infinite
        for(int i = 0; i<nums.length; i++){
            if(largest<nums[i]){
                largest = nums[i];
            }

        }
        return largest;
    }
    public static void main(String args[]){
        int nums [] = {1,6,8,35,2,9};
        System.out.println("Largest number in the array is :- " + findLargest(nums));

    }
}
