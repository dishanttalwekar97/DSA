

public class Addnodefirst {
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


    // node Add At Starting of link list
    public void FirstAdd(int data){
        //Step-1: crearte newnode
        Node Newnode = new Node(data);
        size++;
        if(head == null){
            head =tail = Newnode;
            return;
        }

        //Step-2: newnode.next = head;
        Newnode.next = head;

        //Steo-3 : Newnode = head;
        head = Newnode;
    }

    //Node Add at the ending of the linkList
    public void LastAdd(int data){
        //Step-1: create newnode;
        Node Newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = Newnode;
            return;
        }

        //Step-2: tail cha next newnwode
        tail.next = Newnode;

        //Step-3: newnode = tail
        tail = Newnode;
    }
    public void Printlinklist(){
        if(head ==  null){
            System.out.println("liklist is emptu :)");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(0);
    }
    public void Addmiddle(int idx,int data){
        if(idx == 0 ){
            FirstAdd(data);
            return;
        }
        Node Newnode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        Newnode.next = temp.next;
        temp.next =Newnode;
       
    }



    // REmove first node
    public int Removefirstnode(){
        if(size == 0 ){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size ==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //REmove node at the last
    public int Removelastnodde(){
        if(size == 0){
            System.out.println(" ll is empty ");
            return Integer.MIN_VALUE;
        }
        if(size== 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
          }
       // prev = i = size-2;
       Node prev = head;

       for(int i=0;i<size-2;i++){
        prev = prev.next;

       }
       int val = prev.next.data;
       prev.next = null;
       tail = prev;
       size--;
       return val;

    }
    
    public static void main(String args[]){
        Addnodefirst ll = new Addnodefirst();
        ll.FirstAdd(2);
        ll.FirstAdd(1);
        ll.LastAdd(3);
        ll.LastAdd(4);
        ll.Addmiddle(2, 9);
        ll.Printlinklist();
        // System.out.println(ll.size);
        ll.Removefirstnode();
        ll.Printlinklist();
        
        ll.Removelastnodde();
        ll.Printlinklist();;
        System.out.println(ll.size);

        
        
       
}
}
