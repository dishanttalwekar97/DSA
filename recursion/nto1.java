public class nto1 {
    //Decring number
    public static void printdec(int n){
        //base case
        if(n == 1 ){
           System.out.print(n);
           return;

        }
        System.out.print(n + " ");
        printdec(n-1);

    }
    //incrising number

    public static void printincreasing(int n){
        if( n == 1){
            System.out.print( n +" ");
            return;
        }
        printincreasing(n-1);
        System.out.print(n + " ");

    }
    //factorial number
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * factorial(n-1);
        return fn;
    }
    //sum of natural number
    public static int sum(int n){
        if( n == 1){
            return 1;
        }
       int s =  sum(n-1);
       int total = n + sum(n-1);
       return total;
    }

   // fibonachi number
   public static int fib(int n){
        if( n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    //is Sorted
    public static boolean isSorted(int arr[],int i){
        if( i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
       return isSorted(arr, i+1);
    }

    //first accureance
    public static int firstaccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;

        }
        if(arr[i] == key){
            return i;
        }
        return firstaccurence(arr, key,i+1);
    }
    //last Accurence
    public static int lastAccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastAccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    //print x power 1
    public static int power(int x,int n){
        if( n == 0){
            return 1;
        }
        return x*power(x, n-1);
    }


    //Optimize power
    public static int optimizepow(int n,int a){
      if(n == 0){
        return 1;
      }
      int halfpoe = optimizepow(n/2, a);
      int halfpowsquare = halfpoe * halfpoe;

      //odd pow
      if(n%2 != 0){
        halfpowsquare = a * halfpowsquare;
      }
      return halfpowsquare;
    }
    public static void main(String args[]){
        // int n = 5;
        // printdec(n);
        // System.out.println(" ");
        // printincreasing(n);
        // System.out.println(" ");
        // System.out.print(factorial(n));
        // System.out.println(" ");
        // System.out.print(sum(n));
        // System.out.println(" ");
        // System.out.print(fib(n));
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(isSorted(arr, 0));
        System.out.print(firstaccurence(arr,5,0));
        System.out.println(" ");
        System.out.print(lastAccurence(arr, 5, 0));
        System.out.println(" ");
        System.out.print(power(2, 3));
        System.out.println(" ");
        System.out.print(optimizepow(10, 2));




    }
    
}
