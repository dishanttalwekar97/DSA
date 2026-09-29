import java.util.*;

public class Knapsack {

    public static void main(String args[]) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};

        int w = 50;

        // ratio[i][0] = index, ratio[i][1] = value/weight ratio
        double ratio[][] = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // Correct comparator for sorting by ratio in ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        double finalval = 0;  // must be double

        // Process in descending order of value/weight ratio
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                // take the whole item
                finalval += val[idx];
                capacity -= weight[idx];
            } else {
                // take fraction of the item
                finalval += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final value = " + finalval);
    }
}
