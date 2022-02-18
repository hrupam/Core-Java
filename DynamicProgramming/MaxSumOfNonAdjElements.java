package DynamicProgramming;

import java.util.Arrays;

public class MaxSumOfNonAdjElements {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 9};
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(solve(arr, arr.length - 1, dp));
    }

    public static int solve(int[] arr, int index, int[] dp) {
        if (index == 0) return arr[index];
        if (index < 0) return 0;
        if (dp[index] != -1) return dp[index];


        int take = arr[index] + solve(arr, index - 2, dp);

        int nontake = 0 + solve(arr, index - 1, dp);

        return dp[index] = Math.max(take, nontake);
    }
}
