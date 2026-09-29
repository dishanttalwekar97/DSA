import java.util.ArrayList;
class Arraylist{
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add(1);//0(1)
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //get operatin
        int element = list.get(2);
        System.out.println(element);

        //delete operation
        list.remove(3);
        System.out.println(list);

        //Set operation
        list.set(2, 10);
        System.out.println(list);

        //contain
        System.out.println(list.contains(10));

    }
}