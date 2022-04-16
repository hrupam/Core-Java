package relevel;

import java.util.Arrays;
import java.util.Scanner;

public class GcdSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] dp = new int[n + 1][k + 1];
        for (int[] x : dp) Arrays.fill(x, -1);


        int res = f(n, k, k, (int) 1e9 + 7, dp);
        System.out.println(res);

    }

    private static int f(int n, int k, int gcd, int mod, int[][] dp) {
        if (n == 0) return gcd;
        if (dp[n][gcd] != -1) return dp[n][gcd];

        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum = (sum + f(n - 1, k, gcd(gcd, i), mod, dp)) % mod;
        }

        return dp[n][gcd] = sum;
    }

    private static int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }
}
