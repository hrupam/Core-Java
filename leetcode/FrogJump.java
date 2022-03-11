package leetcode;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] stones = {0, 2};
        System.out.println(new FrogJump().canCross(stones));
    }

    private static int f(int i, int jump, int[] a, int n, int[][] dp) {
        if (i == n - 1)
            return 1;
        if (dp[i][jump] != -1)
            return dp[i][jump];

        int[] d = {jump - 1, jump, jump + 1};
        for (int di : d) {
            if (di > 0) {
                int pos = Arrays.binarySearch(a, i + 1, n, a[i] + di);
                if (pos >= 0)
                    if (f(pos, di, a, n, dp) == 1)
                        return dp[i][jump] = 1;
            }

        }
        return dp[i][jump] = 0;

    }

    public boolean canCross(int[] stones) {
        int n = stones.length;
        int[][] dp = new int[n][n];
        for (int[] x : dp)
            Arrays.fill(x, -1);
        int flag = f(0, 0, stones, n, dp);
        if (flag == 1)
            return true;
        return false;

    }
}
