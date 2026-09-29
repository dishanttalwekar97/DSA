import java.util.*;
public class practice {

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(13);
        list.add(41);

        System.out.println(list);

        // int element = list.remove(3);
        // System.out.println(element);

        // System.out.println(list.get(2));
        System.out.println(list.set(1, 10));
        System.out.println(list);
    }
    
}
