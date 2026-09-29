import java.util.*;

import javax.swing.plaf.synth.SynthEditorPaneUI;
public class LEarnString {

    public static void printletter(String c){
        for(int i=0;i<=c.length();i++){
            System.out.print(c.charAt(i));
        }
        System.out.println();
    }

    //palindrome
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) == str.charAt(n-1-i)){

                return true;
            }
        }
        return false;
    }

    public static float Shortestpath(String path){
        int x = 0;
        int y = 0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);

            //east
            if(dir == 'E'){
                x++;
            }
            //wast
            else if(dir == 'W'){
                x--;
            }
            //nort
            else if(dir == 'N'){
                y++;
            }else{
                y--;
            }
        }

        int X2 =x*x;
        int Y2 =y*y;
        return (float)Math.sqrt(X2 + Y2);

    }

    //touppercase

    
    // public static String print(int str,int si,int ei){
        //     String sbuString = " ";
        //     for(int i=si;i<ei;i++){
            //         sbuString +=str.charAt(i);
            //     }
            //     return sbuString;
            // }
            // public static String toUppercase(String str){
            //    StringBuilder sb =new StringBuilder();
            //    char ch =Character.toUpperCase(str.charAt(0));
            //    for(int i=0;i<str.length();i++){
            //     if(str.charAt(i) == ' ' && i < str.length()-1){
            //         sb.append(str.charAt(i));
            //         i++;
            //         sb.append(Character.toUpperCase(str.charAt(i)));
            //     }
            //     else{
            //         sb.append(str.charAt(i));
            //     }
            //    }
            //    return sb.toString();
            // }


            //compress
            public static String Compress(String str){
                String newstr = " ";
                for(int i=0;i<str.length();i++){
                    Integer count = 1;
                    while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                        count++;
                        i++;
                    }
                    newstr += str.charAt(i);
                    if(count > 1){
                        newstr +=count.toString();
                    }
                }
                return newstr;
            }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.print(name);


        // String name2 = "Dishant Talwekar";
        // System.out.print(name2.length());


        //concatinate
        // String a =  "Dishant";
        // String b = "Talwekar";
        // String c = a+" "+b;
        // System.out.print(c);

        //Palindrome
        // String str = "racecar";
        // System.out.print(isPalindrome(str));

        //Shortest path
        // String str = "HEllo world";
        // System.out.print(str.print(0.5));
        String path = "WNESENNN";
        // System.out.print(Shortestpath(path));

    //     //LArgest String
    //     String fruits[] = {"apple","mango","banana"};
    //     String largest = fruits[0];
    //     for(int i=1;i<fruits.length;i++){
    //         if(largest.compareTo(fruits[i]) <0 ){
    //             largest = fruits[i];

    //         }
    //     }
    //     System.out.print(largest);

//     //StringBuilder

//    StringBuilder sb = new StringBuilder();
//    for(char ch ='a';ch<='z';ch++){
//     sb.append(ch);
//    }
//    System.out.print(sb.length());
//    System.out.print(sb);


    // String str = " hii, i am sakshi";
    // System.out.print(toUppercase(str));

    //compress
    String str = "aabbcrrrrrrcdd";
    System.out.print(Compress(str));
 }
}