import java.util.*;
public class abstractClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.walks();
        d.eat();
        System.out.println(d.color);
        
        
    }

    abstract static class Animal{
        String color;
        Animal(){
            color = "brown";
        }
        
        void eat(){
            System.out.println("Animal eats");
        }

        //abstract method inside the abstract class
        abstract void walks();
        
    }

    static class Dog extends Animal{
        void walks(){
            System.out.println("4 legs");
        }
        void colorChange(){
            color = "black";
        }
    }
}
