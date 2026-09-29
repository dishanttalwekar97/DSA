import java.util.*;
public class MergeSortLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node Getmid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //give the mid


    }

    private Node Merge(Node head1,Node head2){
       Node mergell  = new Node(-1);
       Node temp = mergell;

       while(head1 != null && head2 != null){
        if(head1.data <= head2.data){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
            
        }
        else{
            temp.next =  head2;
            head2 = head2.next;
            temp = temp.next;
        }
    }
    while(head1 != null){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
        
    }
    while(head2 != null){
           temp.next =  head2;
           head2 = head2.next;
           temp = temp.next;

       }
       return mergell.next;
    }
    public Node MergeSort(Node head){
        if(head == null || head.next == null){
            return head;

        }

        //find mid
        Node mid  = Getmid(head);

        //  left and right MS
        Node righthead = mid.next;

        mid.next = null;

        Node newleft = MergeSort(head);
        Node newright = MergeSort(righthead);

        //Merge
        return Merge(newleft,newright);

        
    }
    public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}

    public static Node head;
    public static Node tail;
    public static void main(String args[]){
        MergeSortLL list = new MergeSortLL();

    // Manually create linked list: 5 -> 4 -> 3 -> 2 -> 1
    head = new Node(5);
    head.next = new Node(4);
    head.next.next = new Node(3);
    head.next.next.next = new Node(2);
    head.next.next.next.next = new Node(1);

    System.out.println("Original List:");
    printList(head);

    // Sort the list
    head = list.MergeSort(head);

    System.out.println("Sorted List:");
    printList(head);
        

    }
}
