package leetcode;

public class BuySellStock_121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(new BuySellStock_121().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int currMin = prices[0];
        int profit = 0;

        for (int i = 1; i < n; i++) {
            int p = prices[i] - currMin;
            profit = Math.max(profit, p);
            currMin = Math.min(currMin, prices[i]);
        }
        return profit;

    }
}
