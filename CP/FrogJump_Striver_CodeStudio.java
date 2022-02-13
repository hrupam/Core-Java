package CP;

import java.util.Arrays;

public class FrogJump_Striver_CodeStudio {
    public static void main(String[] args) {
        int[] arr = {7, 4, 4, 2, 6, 6, 3, 4};
        System.out.println(solve(arr, 0, 0));
        System.out.println(solve(arr, arr.length - 1));

        int[] dp = new int[arr.length + 1];
        Arrays.fill(dp, -1);
        System.out.println(solve(arr, arr.length - 1, dp));

        System.out.println(solve(arr, 0, 4, 0));
    }

    //Recursive approach
    private static int solve(int[] arr, int index, int energy) {
        if (index == arr.length - 1) return energy;

        int l = solve(arr, index + 1, energy + Math.abs(arr[index + 1] - arr[index]));
        int r = Integer.MAX_VALUE;
        if (index + 2 < arr.length)
            r = solve(arr, index + 2, energy + Math.abs(arr[index + 2] - arr[index]));
        return Math.min(l, r);
    }

    //Recurisve approach with K jumps
    private static int solve(int[] arr, int index, int k, int energy) {
        if (index == arr.length - 1)
            return energy;

        int minimum = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {

            if (index + i < arr.length) {
                int l = solve(arr, index + i, k, energy + Math.abs(arr[index] - arr[index + i]));
                minimum = Math.min(minimum, l);
            }
        }
        return minimum;
    }

    //Reverse recursion approach
    private static int solve(int[] arr, int index) {
        if (index == 0) return 0;
        int l = solve(arr, index - 1) + Math.abs(arr[index - 1] - arr[index]);
        int r = Integer.MAX_VALUE;
        if (index > 1)
            r = solve(arr, index - 2) + Math.abs(arr[index - 2] - arr[index]);
        return Math.min(l, r);
    }

    //Dynamic Programming
    private static int solve(int[] arr, int index, int[] dp) {
        if (index == 0) return 0;
        if (dp[index] != -1) return dp[index];
        int l = solve(arr, index - 1, dp) + Math.abs(arr[index - 1] - arr[index]);
        int r = Integer.MAX_VALUE;
        if (index > 1)
            r = solve(arr, index - 2, dp) + Math.abs(arr[index - 2] - arr[index]);
        return dp[index] = Math.min(l, r);
    }
}
