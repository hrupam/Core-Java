package leetcode;

import java.util.Arrays;

public class EditDistance_72 {
    public static void main(String[] args) {
        String s1 = "morning";
        String s2 = "bring";
        System.out.println(new EditDistance_72().minDistance(s1, s2));
    }

    private static int f(int i, int j, String s1, String s2, int[][] dp) {
        if (i == -1) return j + 1;
        if (j == -1) return i + 1;

        if (dp[i][j] != -1) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j))
            return f(i - 1, j - 1, s1, s2, dp);

        int I = 1 + f(i, j - 1, s1, s2, dp);
        int REM = 1 + f(i - 1, j, s1, s2, dp);
        int REP = 1 + f(i - 1, j - 1, s1, s2, dp);

        return dp[i][j] = Math.min(I, Math.min(REM, REP));
    }

    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for (int[] x : dp) Arrays.fill(x, -1);

        return f(word1.length() - 1, word2.length() - 1, word1, word2, dp);
    }
}
