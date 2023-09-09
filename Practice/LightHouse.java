import java.util.*;
public class LightHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int theta = sc.nextInt();

        if(h>=100){
            System.out.println("Invalid input");
        }

        double x = h * Math.tan(Math.toRadians(theta));
        double area = Math.PI * x * x;
        area = Math.ceil(area);
        System.out.println("Area covered by light house: " + area);
    }
}
