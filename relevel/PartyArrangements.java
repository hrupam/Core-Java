package relevel;

import java.util.Arrays;
import java.util.Scanner;

public class PartyArrangements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt(); //square
            int m = sc.nextInt(); //triangle
            int[][] dp = new int[n + 1][m + 1];
            for (int[] x : dp) Arrays.fill(x, -1);
            int res = f(n, m, dp);
            System.out.println(res);
        }
    }

    static int f(int n, int m, int[][] dp) {
        if (n <= 0) return m / 5;
        if (m < 2) return 0;
        if (dp[n][m] != -1) return dp[n][m];

        int a = 0;
        int b = 0;
        a = 1 + f(n - 1, m - 2, dp);
        if (m >= 5) b = 1 + f(n, m - 5, dp);

        return dp[n][m] = Math.max(a, b);
    }
}
