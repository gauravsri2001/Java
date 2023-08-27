import java.util.*;

public class ReverseStack {

    public static void pushAtbottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
        } else {
            int top = s.pop();
            pushAtbottom(s, data);
            s.push(top);
        }
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtbottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);
        printStack(s);
    }
}
