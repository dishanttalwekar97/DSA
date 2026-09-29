import java.util.*;
public class Arraypractice {
    public static int max(int number[]){
        int largest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if( largest < number[i]){
                largest = number[i];
                System.out.print(largest);
            }
            if(lowest > number[i] ){
                lowest = number[i];
            }
        }
        System.out.println("Smallest value : "+lowest);
        return largest;
    }

    public static int binarySearch(int number[],int key){
        int st=0;
        int end = number.length-1;
        while (st<end) {
            int mid = (st+end)/2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key){
                st = mid+1;
            }
            else{
                end=mid-1;
            }

            
        }
        return -1;

    }

    public static void reverse(int number[]){
        int st=0, end=number.length-1;
        while ( st < end) {
            int tem = number[st];
            number[st]=number[end];
            number[end] = tem;
            st++;
            end--;
            
        }

    }

    public static void printPair(int number[]){
        int tp=0;
        for(int i=0;i<number.length;i++){
            int curr= number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr+" , "+number[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pair = "+tp);
    }

    public static void subArray(int number[]){
        int Total=0;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(number[k]+" ");
                    Total++;
                }
                System.out.println();
            }
            System.out.println();

        }
        System.out.print("Total is = "+Total);
    }

    public static void SubarraySum(int number[]){
        int currsum = 0;
        int Maxsun = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum += number[k];


                }
                System.out.println(currsum);
                if(Maxsun < currsum){
                    Maxsun = currsum;
                }
            }
        }
        System.out.print("max sum is = "+Maxsun);
    }
    
    public static void Subarraypref(int number[]){
        int n=number.length;
        int prefix[] = new int[n];
        prefix[0]=number[0];
        int Maxsun = Integer.MIN_VALUE;
        

        for(int i=0;i<n;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int currsum = i == 0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(currsum < Maxsun){
                    currsum = Maxsun;
                }

            }
        }
        System.out.print("max sum is = "+Maxsun);
    }

    public static int ByandSellStock(int price[]){
        int byprice = Integer.MAX_VALUE;//-infinity
        int maxprofit = 0;
        for(int i=0;i<price.length;i++){
            if(byprice < price[i]){
                int profit = price[i] - byprice;
                maxprofit =Math.max(maxprofit, profit);
            }else{
                byprice = price[i];
            }
        }
        return maxprofit;
    }




    
    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};
        // printPair(number);
        System.out.print(ByandSellStock(price)); 
       
        }
        

    }


