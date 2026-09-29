public class butterfly {
    public static void butterfly1(int n){
        //First half
        for(int i=1;i<=n;i++){
          //print - i
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }
    
          //print space
          for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
          }
          
          //print star
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }
          System.out.println();
        }
    
        //Second half
    
        for(int i=n;i>=1;i--){
          //print i
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }
          for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
          }
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }
          System.out.println();
          
        }
    
      }
      public static void main(String args[]){
        butterfly1(10);
    
      }
}
