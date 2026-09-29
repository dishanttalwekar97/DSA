import java.util.ArrayList;
import java.util.Collections;

public class Findmax {
    public static void Swaptwono(ArrayList<Integer> list ,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1 , list.get(idx2));
        list.set(idx2 , temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(8);
        list.add(6);
        list.add(1);
        System.out.println("Starting list : " + list);
        Collections.sort(list);  // Assending order
        System.out.println("Sorted list in Assending order : " + list);

        Collections.sort(list ,Collections.reverseOrder()); //  Dessendoing order
        System.out.println("Sorted list in Desnding order : " + list);

        int idx1 = 1;
        int idx2 = 3;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("max element  : " + max);
        Swaptwono(list, idx1, idx2);
        System.out.print(list);
    }
    
}
