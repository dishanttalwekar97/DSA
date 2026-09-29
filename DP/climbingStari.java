
import java.util.*;
public class climbingStari {

    public static int recursion(int n){
        if(n == 0){
            return 1;
        }
        if(n  < 0){
            return 0;
        }
        return recursion(n-1) + recursion(n-2); 
    }

    public static int MEmoization(int n,int arr[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(arr[n] != -1){
            return arr[n];
        }
        arr[n] = MEmoization(n-1, arr) + MEmoization(n-2, arr);
        return arr[n];
    }

    public static int Tabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            if(i == 1){
                dp[i] = dp[i-1] + 0;
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];

    }
    public static void main(String[] args) {
        int n =5;
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        System.out.println("Resursion outpur = "+recursion(n));
        System.out.println("Memoization output = "+MEmoization(n, arr));
        System.out.println("tabulatiopn output = "+Tabulation(n));
}
}