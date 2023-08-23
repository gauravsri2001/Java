package OOPs;

import java.util.*;

public class OOPs {
    static class Pen {
        static String color; // Make color static
        int tip;

        void setColor(String newColor) {
            color = newColor;
        }

        void setTip(int newTip) {
            tip = newTip;
        }
    }

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(Pen.color); // Access the static color variable
    }
}
