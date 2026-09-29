public class dimond {
    public static void printdiamod(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            //Star
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
           System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }
    public static void main(String args[]){
        printdiamod(4);

    }
}
