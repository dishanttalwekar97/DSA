import java.util.*;


public class priority{

    
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        //where we usecompareter reverser order to reverse the pq 
        //if you want to print in normal form you just deletet that part in code 
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove(); 
        }
    }
}
