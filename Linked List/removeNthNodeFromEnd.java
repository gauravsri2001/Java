import java.util.*;
public class removeNthNodeFromEnd {

    public static class Node{
        Node next;
        int data;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addNode(int data){
        Node n1 = new Node(data);
        if(head==null){
            head = tail = n1;
            return;
        }
        n1.next = head;
        head = n1;
    }

    //remove nth node from end
    public void removeFromEnd(int n){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }

        //if nth node is the head only
        if(n==size){
            head = head.next;
            return;
        }

        //remove the nth node
        int i = 1;
        int j = size-n; // find prev
        Node prev = head;
        while(i<j){
            prev=prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        removeNthNodeFromEnd l1 = new removeNthNodeFromEnd();
        l1.addNode(5);
        l1.addNode(4);
        l1.addNode(3);
        l1.addNode(2);
        l1.addNode(1);
        l1.printList();
        l1.removeFromEnd(2);
        l1.printList();

    }
}
