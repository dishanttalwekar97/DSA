import java.util.*;
public class iteration {
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();


        hm.put("India", 1);
        hm.put("Chaina", 2);
        hm.put("SouthAfreka", 3);
        hm.put("dubai", 4);

        //Iteratin 
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = "+k+"   value = "+hm.get(k));
            
            
        }

    }
}
