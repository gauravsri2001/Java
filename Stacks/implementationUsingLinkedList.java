import java.util.*;
public class implementationUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        static class stack{
            static Node head = null;
            public static boolean isEmpty(){
                return head == null;
            }

            public static void push(int data){
                Node n = new Node(data);
                if(isEmpty()){
                    head = n;
                }
                head = head.next;
                head = n;
            }

            public static int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }

            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }
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
