package tcsCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinVend {
    public static void main(String[] args) {
        int R = 10;
//        List<List<Integer>> list = new LinkedList<>();
//        System.out.println(solve(0, R, 0, new ArrayList<>(), list));
//        System.out.println(list);

        int[][] dp = new int[R + 1][3];
        for (int[] x : dp) Arrays.fill(x, -1);
        System.out.println(f(R, 0, dp));
    }

    private static int solve(int sum, int R, int lastCoin, List<Integer> coins, List<List<Integer>> list) {
        if (sum > R) return 0;
        if (sum == R) {
            list.add(new ArrayList<>(coins));
            return 1;
        }

        coins.add(1);
        int l = solve(sum + 1, R, 1, coins, list);
        coins.remove(coins.size() - 1);
        int r = 0;
        if (lastCoin != 2) {
            coins.add(2);
            r = solve(sum + 2, R, 2, coins, list);
            coins.remove(coins.size() - 1);
        }

        return l + r;
    }

    //DP
    private static int f(int target, int lastCoin, int[][] dp) {
        if (target == 0) return 1;
        if (dp[target][lastCoin] != -1) return dp[target][lastCoin];
        int l = f(target - 1, 1, dp);
        int r = 0;
        if (lastCoin != 2 && target >= 2) r = f(target - 2, 2, dp);

        return dp[target][lastCoin] = l + r;
    }
}
