import java.util.*;
public class first{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int marks[] = new int [10];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        int percent = ((marks[0] + marks[1] + marks[2])/3);

        System.out.println("Phy" + marks[0]);
        System.out.println("Phy" + marks[1]);
        System.out.println("Phy" + marks[2]);
        System.out.println("Percent = " + percent  );

    }
}