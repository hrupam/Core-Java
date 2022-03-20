package leetcode;

import java.util.Arrays;

public class WildcardMatching_44 {

    public static void main(String[] args) {
        String s = "abbabbbaabaaabbbbbabbabbabbbabbaaabbbababbabaaabbab";
        String p = "*aabb***aa**a******aa*";
        System.out.println(isMatch_Tabulation(s, p));
    }

    private static boolean toBoolean(int x) {
        return x == 1;
    }

    static int f(int i, int j, char[] s1, char[] s2, int[][] dp) {
        if (i < 0 && j < 0) return 1;
        if (i < 0 && j >= 0) return 0;
        if (j < 0 && i >= 0) {
            for (int k = 0; k <= i; k++) if (s1[k] != '*') return 0;
            return 1;
        }
        if (dp[i][j] != -1) return dp[i][j];


        if (s1[i] == s2[j] || s1[i] == '?') return dp[i][j] = f(i - 1, j - 1, s1, s2, dp);

        //recursive approach
        if (s1[i] == '*') return dp[i][j] = f(i - 1, j, s1, s2, dp) | f(i, j - 1, s1, s2, dp);

        //loop approach
        /*
        if (s1[i] == '*') {
            for (int k = 0; k <= j + 1; k++) {
                if (f(i - 1, j - k, s1, s2, dp) == 1) return dp[i][j] = 1;
            }
            return dp[i][j] = 0;
        }
         */


        return dp[i][j] = 0;


    }

    public static boolean isMatch(String s, String p) {

        String s1 = p;
        String s2 = s;

        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n][m];
        for (int[] x : dp) Arrays.fill(x, -1);

        int res = f(n - 1, m - 1, s1.toCharArray(), s2.toCharArray(), dp);
        return toBoolean(res);

    }

    public static boolean isMatch_Tabulation(String s, String p) {
        char[] s1 = p.toCharArray();
        char[] s2 = s.toCharArray();

        int n = s1.length;
        int m = s2.length;

        boolean[][] dp = new boolean[n + 1][m + 1];
        for (boolean[] x : dp) Arrays.fill(x, false);

        dp[0][0] = true;
        for (int j = 1; j <= m; j++) dp[0][j] = false;
        for (int i = 1; i <= n; i++) {
            boolean f = true;
            for (int k = 1; k <= i; k++) {
                if (s1[k - 1] != '*') {
                    f = false;
                    break;
                }
            }
            dp[i][0] = f;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (s1[i - 1] == s2[j - 1] || s1[i - 1] == '?') dp[i][j] = dp[i - 1][j - 1];


                else if (s1[i - 1] == '*') dp[i][j] = dp[i - 1][j] | dp[i][j - 1];

                else dp[i][j] = false;

            }
        }

        return dp[n][m];

    }
}
