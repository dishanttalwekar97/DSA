import java.util.*;

public class practice {

    public static int trap(int hei[]) {
        int n = hei.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        // Fill left max
        leftmax[0] = hei[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(hei[i], leftmax[i - 1]);
        }

        // Fill right max
        rightmax[n - 1] = hei[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(hei[i], rightmax[i + 1]);
        }

        // Calculate trapped water
        int tp = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            tp += waterlevel - hei[i];
        }

        return tp;
    }

    public static void main(String[] args) {
        int hei[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped Rainwater: " + trap(hei));
    }
}
