import java.util.Scanner;

public class inputOutput {
    public static void main(String args[]) {
         Scanner sc  = new Scanner(System.in);

         System.out.print("ENter your name");
         String name = sc.nextLine();

         System.out.print("Enter your last name");
         String lname = sc.nextLine();

         System.out.print("hello" +name + "!");
         System.out.print("your name is "+name+ "your last name is"+lname+"......");
        
    }
    
}
