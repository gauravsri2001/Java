import java.util.*;
import java.util.LinkedList;
public class linkedListInJavaCollectionFramework {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList();
        l1.add(0, 5);
        l1.add(1, 8);
        l1.add(2, 9);
        System.out.println(l1);
        
        l1.remove(1);
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
    }
}
