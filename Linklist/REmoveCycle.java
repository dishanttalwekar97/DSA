public class REmoveCycle {

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

    public static void Remove(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                cycle = true;  //found cycle
            }
        }
        if(cycle == false){
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle
        prev.next = null;
    }
    
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;  //Cycle exit
            }
        }
        return false;  //Cycle dosent exit
    }
    public static void main(String srgs[]){
        head = new Node(1);
        Node temp =  new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; 

        //1-> 2 -> 3  -> 2

        System.out.println(isCycle());
        Remove();
        System.out.println(isCycle());

        

    }
}
