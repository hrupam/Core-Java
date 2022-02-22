package DynamicProgramming;

import java.util.Arrays;

public class MaxPathSum {


    public static int minSumPath(int[][] grid) {
        // Write your code here.
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int[] x : dp) Arrays.fill(x, -1);
        return f(n - 1, m - 1, grid, dp);
    }

    private static int f(int i, int j, int[][] grid, int[][] dp) {
        if (i == j && j == 0) return grid[i][j];
        if (dp[i][j] != -1) return dp[i][j];

        int up = Integer.MAX_VALUE;
        if (i > 0) up = grid[i][j] + f(i - 1, j, grid, dp);

        int left = Integer.MAX_VALUE;
        if (j > 0) left = grid[i][j] + f(i, j - 1, grid, dp);

        return dp[i][j] = Math.min(up, left);
    }

}
