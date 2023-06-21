import java.util.*;
public class shortestPath {
    public static float getShortestPath(String str){
        int x=0;
        int y =0;
        for(int i=0; i<str.length();i++){
            char element = str.charAt(i);

            if(element=='N'){
                y++;
            }
            else if(element=='S'){
                y--;
            }
            else if(element=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        int a = x*x;
        int b = y*y;
        return (float)Math.sqrt(a + b);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getShortestPath(str));
    }
}
