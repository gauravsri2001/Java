import java.util.*;
public class addInMiddle {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node n1 = new Node(data);
        size++;
        if(head==null){
            head=tail=n1;
            return;
        }
        
        n1.next = head;
        head = n1;
        
    }

    public void addLast(int data){
        Node n2 = new Node(data);
        size++;
        if(head==null){
            head=tail=n2;
            return;
        }
        tail.next = n2;
        tail = n2;
    }

    public void addMiddle(int idx, int data){
        Node n3 = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        } 
        n3.next = temp.next;
        temp.next = n3; 
    }

    public void print(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node temp= head;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        addInMiddle l1 = new addInMiddle();
        l1.addFirst(1);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addLast(9);
        l1.addMiddle(2, 7);
        l1.print();
        System.out.println(l1.size);
    }
}
