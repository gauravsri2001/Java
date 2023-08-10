import java.util.*;
public class reverseLinkedList {
    public static class Node {
    
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node n1 = new Node(data);
        if(head==null){
            head=tail=n1;
            return;
        }
        n1.next = head;
        head = n1;
    }
    //reverse the ll

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        reverseLinkedList l1 = new reverseLinkedList();
        l1.addFirst(5);
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.print();
        l1.reverse();
        l1.print();

    }
}
