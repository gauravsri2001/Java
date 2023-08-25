import java.util.*;
public class implementationUsingArrays {
    static class stack{
        int n = 100; //size of array
        int num [] = new int[n];
        int top = -1; //pointer

        void push(int x){
            top++;
            num[top] = x;
        }

        int pop(){
            int x = num[top];
            top--;
            return x;

        }
        int top(){
            return num[top];
        }
        int size(){
            return top +1;
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());
    }
}
