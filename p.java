public class p{
  public static void solidroh(int n){
    for(int i=1;i<=n;i++){
      //Space
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=n;j++){
        System.out.print("*");
      }
      System.out.println();
    }  
  }
  public static void hollowrho(int n){
    for(int i=0;i<=n;i++){

      for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
      }
      //Hollow rohmbus
      for(int j=1;j<=n;j++){
        if(i==1 || i==n ||  j==1 || j==n){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
   

  }
  public static void main(String args[]){
    // solidroh(5);
    hollowrho(9);

  }
}