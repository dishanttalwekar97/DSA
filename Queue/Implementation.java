public class Implementation{

    static class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
 }

 //create Queue using link list
  static class QueueLinklist{
    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty(){
        return head == null && tail == null;
    }

    //Add operation
    public static void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return ;

        }   
        tail.next = newNode;
        tail = newNode;
     }

     //remove
     public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        return -1;       
     }
        int front = head.data;
        if(tail == head){
            tail = head = null;
        }else{
           head = head.next;
        }
        return front;
     }
     //peak
     public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
     }


  }

    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }
        
        //Enqueue Operation
        public static void add(int data){
            if(rear == size -1){
                System.out.println("Queue is full");
                return;
            }

            rear = rear +1;
            arr[rear]  = data;
        }

        //Dequeue Operatin
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front  = arr[0];

            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear = rear -1;
            return front;
        }

        //peak Operation  
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }

    }

    public static void main(String args[]){
        QueueLinklist q1 = new QueueLinklist();
        q1.add(1);
        q1.add(2);
        q1.add(3);
         while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }

        // Queue Q = new Queue(5);

        // Q.add(1);
        // Q.add(2);
        // Q.add(3);

        // while(!Q.isEmpty()){
        //     System.out.println(Q.peek());
        //     Q.remove();
        // }

    }
    
}
