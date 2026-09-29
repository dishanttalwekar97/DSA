public class Search {
    // Node class representing each element in the linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Head and tail of the linked list
    public static Node head;
    public static Node tail;

    // Constructor
   

    // Iterative search for a value in the linked list
    public int iterativeSearch(int key) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.data == key) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1; // Not found
    }

    // Print the linked list
    public static void printList() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Add a node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
      //Node Add at the ending of the linkList
    public void LastAdd(int data){
        //Step-1: create newnode;
        Node Newnode = new Node(data);
        // size++;
        if(head == null){
            head = tail = Newnode;
            return;
        }

        //Step-2: tail cha next newnwode
        tail.next = Newnode;

        //Step-3: newnode = tail
        tail = Newnode;
    }

    // Helper for recursive search
   private int helper(Node current, int key) {
    if (current == null) {
        return -1;
    }
    if (current.data == key) {
        return 0;
    }

    int result = helper(current.next, key);
    
    if (result == -1) {
        return -1;
    } else {
        return result + 1;
    }
}


    // Recursive search using helper
    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        tail = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
    }

    //Solow fast Approach

    public Node FindMid(Node head){
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next; //+1
                fast = fast.next.next; //+2


            }
            return slow; //Slow is my middle
    }

    public boolean checkPalindrome(){
        if(head == null && head.next ==null){
            return true;
        }

        //Step-1 
        Node midNode = FindMid(head);

        //Step-2; reverse the node
        Node prev =null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        //Step-3; check left half and wright half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Search list = new Search();
        // printList();

        
        // list.addFirst(1);
        // list.addFirst(3);
        // list.addFirst(4);
        // list.addFirst(5);
        // printList();

        // System.out.println("Index of 3 (recursive search): " + list.recursiveSearch(3));

        // list.reverse();
        // System.out.println("Reversed list:");
        // printList();

        //for palindrome code
        Search ll = new Search();

        ll.LastAdd(1);
        ll.LastAdd(2);
        ll.LastAdd(2);
        ll.LastAdd(4);
        ll.printList();
        System.out.print(ll.checkPalindrome());
    }
}


