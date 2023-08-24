import java.util.*;
public class inheritanceInJava {
    public static void main(String[] args) {
        // Fish f = new Fish();
        // f.eat();

        // Dog d = new Dog();
        // d.legs = 4;
        // d.eat();
        // System.out.println(d.legs);

        Bird b = new Bird();
        b.eat();

        Cow c = new Cow();
        c.eat();
    }

    //base class
    static class Animal{
        String color;
        void eat(){
            System.out.println("eats");
        }

        void breath(){
            System.out.println("breathes");
        }

    }

    //Derived class
    static class Fish extends Animal{
        void swims(){
            System.out.println("fish swims");
        }
    }

    //Multi-level Inheritance

    static class Mammal extends Animal{
        int legs;
        void walks(){
            System.out.println("Walks");
        }
    }

    static class Dog extends Mammal{
        String breed;
        
    }

    //Hierarchical Inheritance

    static class Bird extends Animal{
        void fly(){
            System.out.println("Flies");
        }
    }

    static class Cow extends Animal{
        void wals(){
            System.out.println("Walks");
        }
    }
}
