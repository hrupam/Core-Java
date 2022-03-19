package leetcode;

import java.util.Arrays;

public class DistinctSubsequence {
    public static void main(String[] args) {
        String s = "rabbbit", t = "rabbit";
        int res = numDistinct_Tabulation(s, t);
        System.out.println(res);
    }

    static int f(int i, int j, char[] s1, char[] s2, int[][] dp) {

        if (j < 0) return 1;
        if (i < 0) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        int l = 0;
        int r = 0;
        if (s1[i] == s2[j]) {
            l = f(i - 1, j - 1, s1, s2, dp);
            r = f(i - 1, j, s1, s2, dp);
            return dp[i][j] = l + r;
        }

        return dp[i][j] = f(i - 1, j, s1, s2, dp);


    }

    public static int numDistinct_Tabulation(String s, String t) {
        int n = s.length();
        int m = t.length();
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) dp[i][0] = 1;
        for (int j = 1; j <= m; j++) dp[0][j] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (s1[i - 1] == s2[j - 1]) dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                else dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[n][m];
    }

    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n][m];
        for (int[] x : dp) Arrays.fill(x, -1);
        return f(n - 1, m - 1, s.toCharArray(), t.toCharArray(), dp);
    }
}
