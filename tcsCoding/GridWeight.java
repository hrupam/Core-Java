package tcsCoding;

import java.util.Arrays;

public class GridWeight {
    public static void main(String[] args) {
        int n = 4;
//        int[][] grid=new int[n][n];
        int[][] grid = {
                {1, 8, 21, 7},
                {19, 17, 10, 20},
                {2, 18, 23, 22},
                {14, 25, 4, 13}
        };

        int[][] dp = new int[n][n];
        for (int[] x : dp) Arrays.fill(x, -1);

//        System.out.println(f(0, 0, grid[0][0], grid, n, dp));
        System.out.println(f(0, 0, grid, n, dp));

    }


    private static int f(int i, int j, int weight, int[][] grid, int n, int[][] dp) {
        if (i == j && j == n - 1) return weight;

        if (dp[i][j] != -1) return dp[i][j];

        int right = Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;
        if (j < n - 1) right = f(i, j + 1, Math.max(weight, grid[i][j + 1]), grid, n, dp);
        if (i < n - 1) down = f(i + 1, j, Math.max(weight, grid[i + 1][j]), grid, n, dp);

        return dp[i][j] = Math.min(right, down);
    }

    private static int f(int i, int j, int[][] grid, int n, int[][] dp) {
        if (i == j && j == n - 1) return grid[n - 1][n - 1];

        if (dp[i][j] != -1) return dp[i][j];

        int right = Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;
        if (j < n - 1) right = Math.max(grid[i][j], f(i, j + 1, grid, n, dp));
        if (i < n - 1) down = Math.max(grid[i][j], f(i + 1, j, grid, n, dp));


        return dp[i][j] = Math.min(right, down);
    }
}
