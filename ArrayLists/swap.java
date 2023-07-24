import java.util.*;
public class swap {
    public static void swapping(ArrayList<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(66);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(5);
        Collections.sort(list); //sorting the arraylist
        int i = 1;
        int j = 3;
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); //sorts in descending order
        System.out.println(list);
        
        swapping(list, i, j);
        System.out.println(list);
    }
}
