import java.util.*;

public class constructors{

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Gaurav";
        s1.roll = 73;
        s1.password = "abc";
        System.out.println(s1.name + " " + s1.roll + " " + s1.password);

        Student s2 = new Student(s1); // Copy constructor
        s2.password = "xyz";
        System.out.println(s2.name + " " + s2.roll + " " + s2.password);
    }

    public static class Student {
        String name;
        int roll;
        String password;

        // Copy constructor
        Student(Student s1) {
            this.name = s1.name;
            this.roll = s1.roll;
            this.password = password;
        }

        // Default constructor
        Student() {
            System.out.println("This is Non parameterized constructor");
        }

        //Parameterized Constructor
        Student(String name, int roll) {
            this.name = name;
            this.roll = roll;
            this.password = password;
        }
    }
}
