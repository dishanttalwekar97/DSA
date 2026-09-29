import java.util.*;
public class Implement {
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India", 150);
        hm.put("china",148);
        hm.put("usa",3465);

        System.out.println(hm);

    //     //get - 0(1)
    //     int population = hm.get("India");
    //     System.out.println(population);

    //    System.out.println( hm.get("Indonesia"));

    //    //contain = o(1)

    //    System.out.println(hm.containsKey("India"));
    //    System.out.println(hm.containsKey("Indonesia"));

    //remove = 0(1)
    
    System.out.println(hm.remove("India", 150));
    System.out.println(hm);


    System.out.println(hm.size());

    hm.clear();
    }

    
}
