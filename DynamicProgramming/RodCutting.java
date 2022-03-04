package DynamicProgramming;

import java.util.Arrays;

public class RodCutting {

    public static void main(String[] args) {
        int[] price = {2, 5, 7, 8, 10};
        int n = 5;
        System.out.println(cutRod(price, n));
    }

    public static int cutRod(int price[], int n) {
        // Write your code here.
        int[][] dp = new int[price.length][n + 1];
        for (int[] x : dp) Arrays.fill(x, -1);
        return f(price.length - 1, n, price, dp);
    }

    private static int f(int i, int rodlen, int[] price, int[][] dp) {
        if (rodlen == 0) return 0;
        if (i == 0) return rodlen * price[0];

        if (dp[i][rodlen] != -1) return dp[i][rodlen];

        int take = Integer.MIN_VALUE;
        if (i + 1 <= rodlen) take = price[i] + f(i, rodlen - (i + 1), price, dp);
        int nontake = f(i - 1, rodlen, price, dp);

        return dp[i][rodlen] = Math.max(take, nontake);
    }
}
