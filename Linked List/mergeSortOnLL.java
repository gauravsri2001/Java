import java.util.*;
import java.util.LinkedList;
public class mergeSortOnLL {
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

    private Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid value
    }

    private Node merge(Node leftHead, Node rightHead){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL; // head of mergedLL

        while(leftHead!=null && rightHead!=null){
            if(leftHead.data<=rightHead.data){
                temp.next = leftHead;
                leftHead = leftHead.next;
                temp = temp.next;
            }
            else{
                temp.next = rightHead;
                rightHead = rightHead.next;
                temp = temp.next;
            }
        }
        while(leftHead!=null){
            temp.next = leftHead;
            leftHead = leftHead.next;
            temp = temp.next;
        }
        while(rightHead!=null){
            temp.next = rightHead;
            rightHead = rightHead.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }


    public Node mergeSort(Node head){

        if(head==null || head.next==null){
            return head;
        }

        //find mid
        Node mid = findMid(head);

        //find left and right
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head); //left part
        Node newRight = mergeSort(rightHead); //new right

        //merge
       return merge(newLeft, newRight);
    }

    private static Node convertLinkedListToNode(LinkedList <Integer> ll) {
        Node head = new Node(ll.get(0));
        Node temp = head;
        for (int i = 1; i < ll.size(); i++) {
            temp.next = new Node(ll.get(i));
            temp = temp.next;
        }
        return head;
}
    public static void main(String[] args) {
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(8);
        ll.add(9);
        ll.add(32);

        System.out.println(ll);
        Node head = convertLinkedListToNode(ll);

        // Perform merge sort on the linked list
        Node sortedHead = new mergeSortOnLL().mergeSort(head);

        // Print the sorted linked list
        while (sortedHead != null) {
            System.out.print(sortedHead.data + " ");
            sortedHead = sortedHead.next;
        }

    }
}
