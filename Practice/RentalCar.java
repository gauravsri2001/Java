import java.util.Scanner;

public class RentalCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int time = sc.nextInt();
        int res = 0;

        if(time < 8 && distance < 250){
            //System.out.println("Rs. 2000");
            res = 2000;
        }
        else if(distance > 250 && time<8){
           int ad = distance - 250;
           res = 2000 + ad*20;
        }else if(time > 8 && distance < 250){
            int at = time - 8;
            res = 2000 + at*100;
        }
        else if(time > 8 && distance>250){
            int ad = distance -250;
            res = 2000 + ad*20;
        }
        System.out.println(res);
    }
}
