package tcsCoding;

import java.util.ArrayList;
import java.util.List;

public class ThreePalindromicSubstring {
    public static void main(String[] args) {
        String s = "nayannamantenet";
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++)
            dp[i][i] = true;

        for (int i = 0; i + 1 < len; i++) {
            int j = i + 1;
            if (s.charAt(i) == s.charAt(j)) dp[i][j] = true;
        }

        for (int k = 3; k <= len; k++) {
            for (int i = 0; i + k - 1 < len; i++) {
                int j = i + k - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) dp[i][j] = true;
            }
        }

        List<String> list = new ArrayList<>();
        boolean possible = solve(s, dp, 0, 0, 0, len, list);
        if (possible) System.out.println(list);
        else System.out.println("Impossible");
    }

    private static boolean solve(String str, boolean[][] dp, int i, int j, int count, int len, List<String> list) {
        if (count == 3) {
            if (j == len) return true;
            return false;
        }
        for (int k = j; k < len; k++) {
            if (dp[i][k]) {
                list.add(str.substring(i, k + 1));
                if (solve(str, dp, k + 1, k + 1, count + 1, len, list)) return true;
                list.remove(list.size() - 1);
            }
        }
        return false;
    }
}
