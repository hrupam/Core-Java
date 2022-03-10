package tcsCoding;

import java.util.Arrays;

public class MaxSumOfSortedSubsequence {
    public static void main(String[] args) {
        int[] a = {2, 202, 3, 200, 4, 5};
        int n = a.length;

        int[][] dp = new int[n][n + 1];
        for (int[] x : dp) Arrays.fill(x, -1);

        System.out.println(f(a, 0, n, n, dp));
    }


    private static int f(int[] a, int i, int lasti, int n, int[][] dp) {
        if (i == n - 1) {
            if (lasti == n || a[n - 1] > a[lasti]) return a[n - 1];
            return 0;
        }
        if (dp[i][lasti] != -1) return dp[i][lasti];

        int p = Integer.MIN_VALUE;
        if (lasti == n || a[i] > a[lasti]) p = a[i] + f(a, i + 1, i, n, dp);
        int np = f(a, i + 1, lasti, n, dp);

        return dp[i][lasti] = Math.max(p, np);
    }
}
