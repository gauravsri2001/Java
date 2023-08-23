import java.util.*;
public class GettersAndSetters {
    public static class Pen{
        private String color;
        private int tip;

        void setColor(String color){
            this.color = color;  //this.color refers to the color which is initialized as private
        }
        void setTip(int tip){
            this.tip = tip;  //this.tip refers to the color which is initialized as private
        }

        String getColor(){
            return this.color;
        }
        int getTip(){
            return this.tip;
        }
    }
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.getColor() + " " + p1.getTip());
    }
}
