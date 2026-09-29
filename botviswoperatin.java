public class botviswoperatin {
    public static void evenodd(int n){
        int bitmask = 1;
        if(( n & bitmask )== 0){
            System.out.print("number is even");
        }else{
            System.out.print("number is odd");
        }
    }
    public static int getbit(int n,int i){
        int bitmask = 1<<i;
       return n | bitmask;
    }
    public static int Clear(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int Updatebit(int n,int i,int newBIt){
        n =  Clear(n,i);
    
        int bitmask = newBIt<<i;
        return n | bitmask;
    }

    public static int ClearAll(int n,int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int ClearITHbit(int n,int i,int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i-1);
        int bitmas = a | b;
        return n & bitmas;
    }
    public static boolean isPower(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String args[]){
        System.out.println(2 & 6);
        System.out.println(2 | 6);
        System.out.println(2 ^ 6);
        System.out.println(~4);
        System.out.println(5<<2);
        evenodd(4);
        System.out.println(isPower(15));
    }
}
