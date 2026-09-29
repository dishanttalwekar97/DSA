public class traorainvater {

    public static int rainwater(int height[]) {
        int n = height.length;

        // calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // find trapped water
        int trapWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapWater += waterLevel - height[i];
        }

        return trapWater;
    }

    public static void main(String args[]) {
        int height[] = {2, 4, 0, 6, 3, 2, 5};
        System.out.print(rainwater(height));
    }
}
