import java.util.*;
public class calcula {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Entet value of A : ");
      int a = sc.nextInt();

      System.out.println("Enter value of B : ");
      int b = sc.nextInt();
      
      System.out.println("Enter operator : ");
      char operator = sc.next().charAt(0);


      switch(operator){
        case '+' : System.out.println(a+b);
        break;

        case '-': System.out.println(a-b);
        break;

        case '*': System.out.println(a*b);
        break;

        case '/' : System.out.println(a/b);
        break;


        case '%': System.out.println(a%b);
        break;

        default : System.out.println("tere is no operator present :)");
          }
    }
}


// import java.util.*;
// public class Calculater{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value of A : ");
//         int a = sc.nextInt();

//         System.out.print("Enter valye of B : ");
//         int b = sc.nextInt();

//         System.out.print("Enter value of operation : ");
//         char Operator = sc.next().charAt(0);


//         switch(Operator){
//             case '+' :
//                 System.out.println("Addition of A and B is : " + (a+b));
//                 break;

//             case '-':
//                 System.out.println("Subtraction of A and B is : " + (a-b));
//                 break;
            
//             case '*':
//                 System.out.println("Multipication of A and B is : " +(a*b));
//                 break;

//             case '/':
//                 System.out.println("Division of A and B is : " + (a/b));
//                 break;

//             case '%':
//                 System.out.println("Modulus of A and B is : " + (a%b));
//                 break;

//                 default:
//                     System.out.println("there is no operation is present ");
//         }





//     }
// }