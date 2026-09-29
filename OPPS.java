import java.util.*;
public class OPPS {
    public static void main(String args[]){
        // pen pi = new pen();
        // pi.Setcolor("RED");
        // System.out.println(pi.getcoler());
        // pi.Settip(5);
        // System.out.print(pi.gettip());

        // Student si = new Student();
        // si.setPErsentage(70, 70, 70);
        // System.out.println(si.persentage);

        // fish shark = new fish();
        // shark.eate();
        // shark.breadthe();

    //     bird parot = new bird();
    //     parot.eate();

    //     mammal dishant  = new mammal();
    //     dishant.breadthe();

    //     fish jelly = new fish();
    //     jelly.eate();


    //     peocock peak = new peocock();
    //     peak.fly();
    // }
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.print(a);
    
}
}

// class pen{
//    private String color;
//    private int tip;
//    String getcoler(){
//     return this.color;
//    }
    
//    int gettip(){
//     return this.tip;
//    }
   

//     void Setcolor(String newColor){
//         color = newColor;
//     }

//     void Settip(int newtip){
//         tip = newtip;
//     }
// }

// class Student{
//     String name;
//     int roll;
//     float persentage;

//     void setName(String newname){
//         name = newname;
//     }

//     void serroll(int newroll){
//         roll = newroll;
//     }

//     void setPErsentage(int math,int sci,int eng){
//         persentage = (math + sci + eng)/3;
//     }

// }
class animal{
    String color;

    void eate(){
        System.out.println("eate");
    }   
    void breadthe(){
        System.out.println("breadth");
        
    }
}

class mammal extends animal{
    void walk(){
        System.out.println("walk");
    }
}
class bird extends animal{
    void fly(){
        System.out.println("fly");
    }

}
class fish extends animal{
    void sweem(){
        System.out.println("Sweem");
    }
}
class man extends mammal{
    void person(){
        System.out.print("person");
    }
}

class peocock extends bird{
    void peoc(){
        System.out.print("peocock");

    }
}
