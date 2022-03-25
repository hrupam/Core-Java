package codevita;

import java.util.Arrays;
import java.util.Scanner;

public class QC_DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {

            int s = sc.nextInt();
            int n = sc.nextInt();

            if (n > 1 && n <= 12) {
                int res = getWays(s, n);
                System.out.println(res);
            } else System.out.println(0);


        }
    }

    private static int getWays(int s, int n) {
        int[] dp = new int[s + 1];
        Arrays.fill(dp, -1);
        return f(s, n, dp);
    }

    private static int f(int s, int n, int[] dp) {
        if (s == 0) return 1;
        if (dp[s] != -1) return dp[s];

        int ctr = 0;
        for (int i = 1; i <= n; i++) {
            if (i <= s) ctr += f(s - i, n, dp);
            else break;
        }


        return dp[s] = ctr;
    }
}
