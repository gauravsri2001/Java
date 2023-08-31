import java.util.*;

public class QueueUsigTwoStacks {
    public static class Queue {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();

        public void add(int x) {
            input.push(x);
        }

        public int remove() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.peek());
                    input.pop();
                }
            }
            if (!output.isEmpty()) { // Added this check
                int x = output.peek();
                output.pop();
                return x;
            }
            throw new NoSuchElementException("Queue is empty");
        }

        public int top() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.peek());
                    input.pop();
                }
            }
            if (!output.isEmpty()) { // Added this check
                return output.peek();
            }
            throw new NoSuchElementException("Queue is empty");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(); // Fixed the instantiation of Queue
        q.add(3); // Changed push to add
        q.add(4); // Changed push to add
        System.out.println("The element removed is " + q.remove()); // Changed pop to remove
        q.add(5); // Changed push to add
        System.out.println("The top element is " + q.top());
    }
}
