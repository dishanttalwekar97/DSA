public class GridWay {

    public static int Grid(int i,int j,int n,int m){
        //base case
        if(i == n-1 && j == m-1){
            return 1;

        }
        if(i >= n || j >= m){
    return 0;
}


        //kam
        int w1 = Grid(i+1, j, n, m);
        int w2 = Grid(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String args[]){
        int m = 3;
        int n = 3;
        System.out.print(Grid(0, 0, m, n));

    }
}
