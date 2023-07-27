import java.util.*;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //Add first

        //create a new node
        Node N1 = new Node(data);
        if(head==null){
            head=tail=N1;
            return;
        }

        N1.next = head;
        head = N1;
    }

    public void addLast(int data){
        Node N2 = new Node(data);
        if(head==null){
            head=tail=N2;
            return;
        }
        tail.next = N2;
        tail = N2;

    }

    public void print(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.print();
    }
}
