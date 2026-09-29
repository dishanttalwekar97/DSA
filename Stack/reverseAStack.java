import java.util.*;

public class reverseAStack {
    public static void PushAtBottom(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
            
        }
        int top = s.pop();
        PushAtBottom(s, data);
        s.push(top);

    }

    public static void reversestack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        //recursive call
        int top = s.pop();
        reversestack(s);
        PushAtBottom(s, top);
       

    }
    public static void printstack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());

        }
    }
    public static void main(String args[]){
        Stack<Integer> s =new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        
        reversestack(s);
        printstack(s);
    }
}
