// import java.util.*;
// public class function{
//     public static void print(){
//         System.out.println("Hello World:)");
//         System.out.println("Hello World:)");
//         System.out.println("Hello World:)");
//         return;
//     }

//     public static int printSum(int a,int b){
//         int sum = a+b;
//         return sum;
        
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number");
//         int a = sc.nextInt();
//         System.out.print("Enter Second number");
//         int b= sc.nextInt();
//         int sum = printSum(a, b);
//         System.out.print(sum);
       
        
        

//     }
// }

import java.util.*;
public class function{
    public static int printsum(int a, int b){
        int sum = a + b;
        return sum;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter your Second Number : ");345
        int b  = sc.nextInt();

        // int sum = printsum(a,b);

        System.out.println("Sum of a and b is = " + printsum(a,b));
        
        
    }
}


