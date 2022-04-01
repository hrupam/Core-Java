package leetcode;

import java.util.Arrays;

public class RobotHomecoming_2087 {
    public static void main(String[] args) {
        int[] startPos = {2, 0};
        int[] homePos = {6, 0};
        int[] rowCosts = {4, 3, 9, 0, 10, 0, 15, 14, 12};
        int[] colCosts = {9, 14};

        int res = minCost(startPos, homePos, rowCosts, colCosts);
        System.out.println(res);

    }

    static int f(int i, int j, int homei, int homej, int[] rowCosts, int[] colCosts, boolean[][] isVis, int m, int n, int[][] dp) {
        if (i == homei && j == homej) return 0;
        if (dp[i][j] != -1) return dp[i][j];


        int up = (int) 1e9;
        int down = (int) 1e9;
        int left = (int) 1e9;
        int right = (int) 1e9;

        //up
        if (i - 1 >= 0 && !isVis[i - 1][j]) {
            isVis[i][j] = true;
            up = rowCosts[i - 1] + f(i - 1, j, homei, homej, rowCosts, colCosts, isVis, m, n, dp);
            isVis[i][j] = false;
        }

        //down
        if (i + 1 < m && !isVis[i + 1][j]) {
            isVis[i][j] = true;
            down = rowCosts[i + 1] + f(i + 1, j, homei, homej, rowCosts, colCosts, isVis, m, n, dp);
            isVis[i][j] = false;
        }

        //left
        if (j - 1 >= 0 && !isVis[i][j - 1]) {
            isVis[i][j] = true;
            left = colCosts[j - 1] + f(i, j - 1, homei, homej, rowCosts, colCosts, isVis, m, n, dp);
            isVis[i][j] = false;
        }

        //right
        if (j + 1 < n && !isVis[i][j + 1]) {
            isVis[i][j] = true;
            right = colCosts[j + 1] + f(i, j + 1, homei, homej, rowCosts, colCosts, isVis, m, n, dp);
            isVis[i][j] = false;

        }

        return dp[i][j] = min(up, down, left, right);
    }

    static int min(int a, int b, int c, int d) {

        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        return Math.min(min1, min2);

    }

    public static int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int m = rowCosts.length;
        int n = colCosts.length;

        int i = startPos[0];
        int j = startPos[1];

        int homei = homePos[0];
        int homej = homePos[1];

        boolean[][] isVisited = new boolean[m][n];

        int[][] dp = new int[m][n];
        for (int[] x : dp) Arrays.fill(x, -1);

        return f(i, j, homei, homej, rowCosts, colCosts, isVisited, m, n, dp);

    }
}
