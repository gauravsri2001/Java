import java.util.*;
public class checkPalindrome {

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

    private Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node midNode = findMid(head);

        //reverse the 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //2nd half head
        Node left = head;

        //Compare left and right half
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
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
        checkPalindrome l1 = new checkPalindrome();
        l1.addNode(1);
        l1.addNode(2);
        l1.addNode(3);
        l1.addNode(2);
        l1.addNode(1);
        
        l1.print();

        System.out.println(l1.isPalindrome());

    }
}
