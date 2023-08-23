import java.util.*;

public class contructors {
    public static class Student{
        String name;
        int roll;

        Student(String name, int roll){
            this.name = name;
            this.roll = roll;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Gaurav", 73);
        System.out.println(s1.name + " " + s1.roll);
    }
}
