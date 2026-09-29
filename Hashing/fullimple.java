import java.util.*;
public class fullimple {

    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private LinkedList<Node> bucket[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.n = 0;
            this.bucket =  new LinkedList[4];
            for(int i=0;i<4;i++){
                this.bucket[i] = new LinkedList<>();
            }

            
        }
        public int hashFuncton(K key){
            int hc = key.hashCode();
           return Math.abs(hc) % bucket.length;
        }

        public int SearchInll(K key,int bi){
            LinkedList<Node> ll  = bucket[bi];
            int di =0;

            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;

            }
            return -1;
        }
        public void put(K key ,V value){
            int bi = hashFuncton(key);
            int di = SearchInll(key, bi);

            if(di != -1){
                Node node = bucket[bi].get(di);
                node.value = value;
            }else{
                bucket[bi].add(new Node(key,value));
                n++;
            }

        }
       
    }
    public static void main(String args[]){


    }
    
}
