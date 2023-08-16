//Shopkeeper has to find the price of the products using barcode. Barcode consists of alphabets and numbers. 
// If there is a alphabet then find the ASCII value and take the greated number from the 2-digit or 3-digit. For eg : for A ascii value is 65 then we have to take 6 only from it.
// if there is a digit then we have to take the digit itself.
//then at last add all the elements together.

import java.util.*;
public class findPriceUsingBarcode {
    private static int findMax(int num){
        
        int max = 0;
        while(num!=0){
            if(num%10>max){
                max = num%10;
            }
            num = num/10;
        }
        return max;
    }
    public static int findPrice(String str){
        int price = 0;
        for(int i=0; i<str.length(); i++){
            Boolean flag = Character.isDigit(str.charAt(i));
            if(flag){
                price += str.charAt(i) - 48;
            }
            else{
                price += findMax((int)str.charAt(i));
            }
        }
        return price;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = findPrice(str);
        System.out.println(findPrice(str));
    }
}
