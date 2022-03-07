package DynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubsequence {

    public static int lcs(String s, String t) {
        //Your code goes here
        int[][] dp = new int[s.length()][t.length()];
        for (int[] x : dp) Arrays.fill(x, -1);
        return f(s, t, s.length() - 1, t.length() - 1, dp);
    }

    private static int f(String s1, String s2, int i, int j, int[][] dp) {
        if (i < 0 || j < 0) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        //match
        if (s1.charAt(i) == s2.charAt(j)) return dp[i][j] = 1 + f(s1, s2, i - 1, j - 1, dp);

        //not match
        return dp[i][j] = Math.max(f(s1, s2, i - 1, j, dp), f(s1, s2, i, j - 1, dp));

    }
}
