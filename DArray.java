import java.util.*;
public class DArray {
    public static void max(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            int maxpos = Integer.MIN_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] < maxpos){
                    System.out.print(maxpos);
                }

            }

        }

    }
    public static boolean Search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.print(key+"  index found ("+i+" "+j+")");
                    return true;

                }
            }
        }
        return false;


    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for( int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for( int j=0;j<m;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }


        Search(matrix,5);
        max(matrix);
    }
}
