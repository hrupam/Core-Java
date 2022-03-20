package leetcode;

import java.util.Arrays;

public class RegularExpressionMatching_10 {
    private static boolean toBoolean(int x) {
        return x == 1;
    }

    static int f(int i, int j, char[] s1, char[] s2, int[][] dp) {
        if (i < 0 && j < 0) return 1;
        if (j < 0 && i >= 0) return 0;
        if (i < 0 && j >= 0) {
            while (j >= 0) {
                if (s2[j] != '*') return 0;
                j -= 2;
            }
            return 1;
        }


        if (dp[i][j] != -1) return dp[i][j];


        if (s1[i] == s2[j] || s2[j] == '.') return dp[i][j] = f(i - 1, j - 1, s1, s2, dp);


        if (s2[j] == '*') {
            int l = f(i, j - 2, s1, s2, dp);
            int r = 0;
            if (s2[j - 1] == s1[i] || s2[j - 1] == '.') r = f(i - 1, j, s1, s2, dp);
            return dp[i][j] = l | r;
        }


        return dp[i][j] = 0;


    }

    public boolean isMatch(String s, String p) {
        String s1 = s;
        String s2 = p;

        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n][m];
        for (int[] x : dp) Arrays.fill(x, -1);

        int res = f(n - 1, m - 1, s1.toCharArray(), s2.toCharArray(), dp);
        return toBoolean(res);
    }
}
