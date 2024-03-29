import java.util.*;

public class implementationUsingArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        
        public static boolean isEmpty() {
            return list.size() == 0;
        }
        
        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop.");
                return -1; // or throw an exception
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot peek.");
                return -1; // or throw an exception
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while (!s.isEmpty()) {
            System.out.println("Top of the stack: " + s.peek());
            s.pop();
        }
    }
}
