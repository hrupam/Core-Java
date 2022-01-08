package leetcode;

public class TrappingRainWater {

    public static void main(String[] args) {
//        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height = {};
        System.out.println(new TrappingRainWater().optimal(height));
    }

    private static int leftMax(int[] arr, int index) {
        int max = arr[index];
        for (int i = index; i >= 0; i--) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    private static int rightMax(int[] arr, int index) {
        int max = arr[index];
        for (int i = index; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public int bruteForce(int[] height) {
        int water = 0;
        for (int i = 0; i < height.length; i++) {
            int left = leftMax(height, i);
            int right = rightMax(height, i);
            water += Math.min(left, right) - height[i];
        }

        return water;
    }

    public int optimal(int[] height) {
        int water = 0;

        int[] maxPrefix = new int[height.length];
        int[] maxSuffix = new int[height.length];

        int max = height[0];
        for (int i = 0; i < height.length; i++) {
            max = Math.max(max, height[i]);
            maxPrefix[i] = max;
        }

        max = height[height.length - 1];
        for (int i = height.length - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            maxSuffix[i] = max;
        }

        for (int i = 0; i < height.length; i++)
            water += Math.min(maxPrefix[i], maxSuffix[i]) - height[i];

        return water;
    }
}
