public class DublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
       
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    //remove last
    public int RemoveFirst(){
        if(head == null){
            System.out.println("Doubly link list is empty : ");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;

        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;

        return val;
    }


    //Reerse Doubly linklist
    public void Reverse(){
        Node curr = head;
        Node prev = null;
        Node next ;


        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public void  print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        DublyLL ll =new DublyLL();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        // ll.RemoveFirst();
        // ll.print();

        // System.out.println(ll.size);
        ll.Reverse();
        ll.print();

    }
}
