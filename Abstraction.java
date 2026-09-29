
abstract class animal{
    String color;
    animal(){
        color = "brown";
    }
    void eate(){
        System.out.println("Eate");
    }

    abstract void walk();
}

class horse extends animal{
    void walk(){
        System.out.print("Walk in 4 leg");
    }
}

class checken extends animal{
    void walk(){
        System.out.println("Walk in 2 leg");
    }
}
public class Abstraction {
    public static void main(String args[]){
        
        horse h = new horse();
        h.eate();
        h.walk();

        checken ch = new checken();
        ch.eate();
        ch.walk();

    }
    
}