public class FindRemNthnode {
    public static class Node{
        int data;
        Node  next;

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


    public void DeletNthnode(int n){
        int sz = 0;
        Node temp= head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(n == sz){
            head = head.next;  //remove first

            return;
           }

           //sz-n
           int i=1;
           int iTOfind = sz - n;
           Node prev =  head;
           while(i < iTOfind){
            prev = prev.next;
            i++;
           }

           prev.next = prev.next.next;
           return;
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

    //Slow fast app

    public static void main(String args[]){
        FindRemNthnode ll =new FindRemNthnode();
        ll.FirstAdd(2);
        ll.FirstAdd(1);
        ll.LastAdd(3);
        ll.LastAdd(4);
        ll.LastAdd(5);


        ll.Printlinklist();
        ll.DeletNthnode(4);
        ll.Printlinklist();



    }
}
