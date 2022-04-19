package CodeStudio;

import java.util.Arrays;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int N = arr.length;
        System.out.println(matrixMultiplication(arr, N));
    }

    public static int matrixMultiplication(int[] arr, int N) {
        // Write your code here
        int[][] dp = new int[N][N];
        for (int[] x : dp) Arrays.fill(x, -1);
        int res = f(1, N - 1, arr, dp);
        return res;
    }

    private static int f(int i, int j, int[] arr, int[][] dp) {
        if (i == j) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        int mini = (int) 1e9;
        for (int k = i; k < j; k++) {
            int steps = (arr[i - 1] * arr[k] * arr[j]) + f(i, k, arr, dp) + f(k + 1, j, arr, dp);
            mini = Math.min(steps, mini);
        }
        return dp[i][j] = mini;
    }
}
