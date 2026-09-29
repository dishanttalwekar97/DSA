public class practice {
    public static void Checkeo(int num){
        byte num = 1;
        if(num & 1 == 0){
            System.out.print("Odd");
        }
        else{
            System.out.print("evem");
        }
    }
    public static void main(String args[]){
        Checkeo(5);

    }
}
