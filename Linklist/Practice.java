import java.util.*; 

public class Practice  {
    public static class Node{
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void Addfirest(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;


    }

    public void AddLast(int data){
        Node nweNode  = new Node(data);
        size++;
        if(head == null){
            head = tail = nweNode;
            return;
        }
        tail.next = nweNode;
        nweNode = tail;
    }

    public void Addmiddle(int idx,int data){
        if(idx == 0){
            AddLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        size++;

        while(i < idx - 1){
            temp = temp.next;
            i++;

        }
        
        newNode.next = temp.next;
        temp.next = newNode;
        

    }

    public int RemoveFirst(){
        if(size == 0){
            System.out.println("ll is empty ");
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
        size--;
        return val;

    }

    public int RemoveLast(){
       //size = 0;
       if(size == 0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
       }

       if(size ==1){
        int val = head.data;
        head = tail = null;
        return val;
       }

       Node prev = head;
       for(int i =0;i<size -2;i++){
        prev = prev.next;
       }

       int val = prev.next.data;
       tail = null;
       size--;
       return val;

    }

    //Search key
    public static int Serach(int key){
        Node temp = head;
        int idx = 0;
        while(temp != null){
            if(temp.data == key){
                return idx;

            }
            temp = temp.next;
        }
        return -1;
    }

    public static int recursiveSearch(Node temp,int key){
        if(temp == null){
            return -1;
        }
        if(temp.data == key){
            return 0;
        }

        int result = recursiveSearch(temp.next, key);
         if (result == -1) {
        return -1;
    } else {
        return result + 1;
    }
}
    public int helper(int key){
        return recursiveSearch(head, key);

    }

   public void reverse(){
   //reverse the link list
   Node prev = null;
   Node curr = head;
   Node next;

   while(curr != null){
         next = curr.next;
         curr.next = prev;
         prev = curr;
         curr = next;
   }
   head = prev;
   }

   public Node FindMIde(Node head){
    Node slow = head;
    Node fast = head;

    while(fast!= null && fast.next!= null){
        slow = slow.next;
        fast = fast.next.next;
 }
 return slow;
 
}
public boolean checkPalindrome(){
   if(head == null && head.next == null){
       return true;
   }

   //find mid
   Node mid = FindMIde(head);

   //reverse
   Node prev = null;
   Node curr = mid;
   Node next;

   while(curr != null){
    next = curr.next;
    curr.next = prev;
    prev = curr;
    curr =next;
   }
   Node right = prev;
   Node left = head;

   while(right != null){
    if(left.data != right.data){
        return false;
    }
    left = left.next;
    right = right.next;
   }
return true;


 }
    

    
    public void print(){
          if(head ==  null){
            System.out.println("liklist is emptu :)");
            return;
          }
           
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
         }
         System.out.println("null");
      
    }

    public static void main(String args[]){
        // Practice ll = new Practice();
        // ll.Addfirest(1);
        // ll.Addfirest(2);
        // ll.Addfirest(2);
        // ll.Addfirest(1);
        
        // ll.print();
        // ll.reverse();
        // ll.print();
        // System.out.println(ll.checkPalindrome());
        // ll.print();;
        // // ll.Addmiddle(3, 29);
        // // System.out.print(ll.size);
        // // ll.RemoveLast();
        // // ll.print();

        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);;

        ll.add(2, 11);
        System.out.print(ll);
       

       
        
        
    }
}
