public class Knapsack {

    public static int recursion(int val[], int wt[], int w, int n, int dp[][]) {
        if (w == 0 || n == 0) {
            return 0;
        }

        if (dp[n][w] != -1) {
            return dp[n][w];
        }

        if (wt[n - 1] <= w) {
            // include the item
            int ans1 = val[n - 1] + recursion(val, wt, w - wt[n - 1], n - 1, dp);

            // exclude the item
            int ans2 = recursion(val, wt, w, n - 1, dp);
            dp[n][w] = Math.max(ans1, ans2);
            return dp[n][w];

        } else {
            // not valid
            dp[n][w] = recursion(val, wt, w, n - 1, dp);
            return dp[n][w];
        }
    }

    public static int tabulation(int val[], int wt[], int w) {
        int n = val.length;
        int dp[][] = new int[n + 1][w + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                int v = val[i - 1];
                int W = wt[i - 1];

                if (W <= j) {
                    int incprofit = v + dp[i - 1][j - W]; // ✅ fixed from j - w to j - W
                    int exeprofit = dp[i - 1][j];
                    dp[i][j] = Math.max(incprofit, exeprofit);
                } else {
                    int incprofit = dp[i - 1][j];
                    dp[i][j] = incprofit;
                }
            }
        }
        printArray(dp);
        return dp[n][w]; // ✅ moved outside the loop
    }
public static void printArray(int dp[][]){
    for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            System.out.print(dp[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println();
}
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int w = 7;
        int n = val.length;
        int dp[][] = new int[val.length + 1][w + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(tabulation(val, wt, w));
        System.out.println("recursion output = " + recursion(val, wt, w, n, dp));

    }
}
