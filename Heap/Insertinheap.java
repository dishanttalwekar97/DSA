import java.util.*;

public class Insertinheap {

    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //Add at last index
            arr.add(data);

            int child = arr.size()-1;  //chld index
            int parent = (child-1)/2; //par idx

            while(arr.get(child) < arr.get(parent)){
                //Swap

                int temp = arr.get(child);
                arr.set(child, arr.get(parent));
                arr.set(parent,temp);

                child = parent;
                parent = (child-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }

        //remove from heap

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minidx = i;

            if(left < arr.size() && arr.get(minidx) > arr.get(left)){
                minidx = left;
            }
            if(right < arr.size() && arr.get(minidx) > arr.get(right)){
                minidx = right;
            }

            if(minidx != i){
                int temp = arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);

                heapify(minidx);
            }
        }
        public int remove(){
            int data = arr.get(0);

            ////step - swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //atep 2 remove at last
            arr.remove(arr.size()-1);

            //step 3 heapify
            heapify(0);
            return data; 
        }
        public boolean isEmpty(){
            return arr.size()==0;

        }

    }
    public static void main(String args[]){
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }

    }
    
}
