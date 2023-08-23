import java.util.*;
public class OOPs {
    public static class Pen{
        String color;
        int tip;

        void setColor(String newColor){
            color = newColor;
        }
        void setTip(int newTip){
            tip = newTip;
        }
    }

    public static class Student{
        String name;
        int roll;
        void setName(String newName){
            name = newName;
        }
        void setRoll(int newRoll){
            roll = newRoll;
        }
    }
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.color +" "+ p1.tip);

        Student s = new Student();
        s.setName("Gaurav");
        s.setRoll(73);
        System.out.println(s.name +" "+ s.roll);

    }
}
