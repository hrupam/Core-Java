package DynamicProgramming;

import java.util.Arrays;

public class GridUniquePath {
    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        System.out.println(uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {
        // function call
        int[][] dp = new int[m][n];
        for (var x : dp) Arrays.fill(x, -1);
        return f(m - 1, n - 1, dp);
    }

    //Tabulation
    private static int f(int m, int n) {
        int dp[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) dp[i][j] = 1;
                else {
                    int up = 0;
                    int left = 0;
                    if (i > 0) up = dp[i - 1][j];
                    if (j > 0) left = dp[i][j - 1];
                    dp[i][j] = up + left;
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    //Recursive+Memoization
    private static int f(int i, int j, int dp[][]) {
        if (i == j && j == 0) return 1;
        if (i < 0 || j < 0) return 0;

        int up = f(i - 1, j, dp);
        int left = f(i, j - 1, dp);
        return up + left;
    }
}
