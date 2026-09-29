import java.util.*;
import java.util.Stack;
public class NextGreater {
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextgreater[] = new int[arr.length];

        for(int i =arr.length-1;i>=0;i--){  // if we hav to cacculate next left greater just rever the loop 0 se starst and arr.lenght tak jatega ++

            // 1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){ // smaller right <= chnage that sign
               s.pop();

            }

            //if-else
            if(s.isEmpty()){
                nextgreater[i] = -1;
            }
            else{
                nextgreater[i] = arr[s.peek()];
            }

            //3 push
            s.push(i);
        }

        for(int i=0;i<nextgreater.length;i++){
            System.out.print(nextgreater[i]+" ");
        }
        System.out.println();

        //find next greater right
        //find next greater left
        //find next Smallest right


    }
}
