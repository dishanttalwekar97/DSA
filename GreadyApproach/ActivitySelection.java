import java.util.*;
public class ActivitySelection{
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st Activity
        maxAct = 1;
        int lasEnd = end[0];
        for(int i=0;i<end.length;i++){
            if(start[i] >= lasEnd){
                //Activity
                maxAct++;
                ans.add(i);
                lasEnd = end[i];

            }

        }
        System.out.println("Max Activity = "+ maxAct);

        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i)+ " ");

        }
        System.out.println();
    }
}