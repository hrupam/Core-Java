package leetcode;

import java.util.Arrays;

public class BuySellStock2_122 {
    //memoization function
    private static int f(int ind, int canBuy, int[] arr, int n, int[][] dp) {
        if (ind == n) return 0;
        if (dp[ind][canBuy] != -1) return dp[ind][canBuy];

        int profit = 0;

        //can buy
        if (canBuy == 1)
            profit = Math.max(-arr[ind] + f(ind + 1, 0, arr, n, dp), f(ind + 1, 1, arr, n, dp));

            //cannot buy -> sell
        else
            profit = Math.max(arr[ind] + f(ind + 1, 1, arr, n, dp), f(ind + 1, 0, arr, n, dp));

        return dp[ind][canBuy] = profit;
    }

    public int maxProfit_Tabulation(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n + 1][2];
        int[] arr = prices;

        dp[n][0] = dp[n][1] = 0;

        for (int ind = n - 1; ind >= 0; ind--) {
            for (int canBuy = 0; canBuy <= 1; canBuy++) {

                int profit = 0;

                //can buy
                if (canBuy == 1)
                    profit = Math.max(-arr[ind] + dp[ind + 1][0], dp[ind + 1][1]);

                    //cannot buy -> sell
                else
                    profit = Math.max(arr[ind] + dp[ind + 1][1], dp[ind + 1][0]);

                dp[ind][canBuy] = profit;
            }
        }

        return dp[0][1];
    }

    public int maxProfit_Memoization(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int[] x : dp) Arrays.fill(x, -1);

        int res = f(0, 1, prices, n, dp);
        return res;

    }
}
