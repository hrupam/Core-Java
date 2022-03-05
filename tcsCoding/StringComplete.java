package tcsCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringComplete {

    public static void main(String[] args) {
        String s = "butfl";
        String target = "beautiful";
//        System.out.println(canComplete(s, target));
//        System.out.println(canComplete2(s, target, 0, ""));

        //DP approach
        int[][] dp = new int[s.length()][target.length()];
        for (int[] x : dp) Arrays.fill(x, -1);

        int n = canCompleteDP(s, target, s.length() - 1, target.length() - 1, dp);
        if (n == s.length()) System.out.println(true);
        else System.out.println(false);
    }

    private static boolean canComplete(String s, String target) {

        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++)
            target = target.replaceFirst("" + str[i], "" + i);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            if (Character.isDigit(c))
                list.add(Integer.parseInt("" + c));
        }

        if (list.size() == str.length && isSorted(list))
            return true;
        return false;
    }

    private static boolean canComplete2(String s, String target, int i, String str) {
        if (i == target.length()) {
            if (str.equals(s)) return true;
            return false;
        }

        if (canComplete2(s, target, i + 1, str + target.charAt(i))) return true;
        if (canComplete2(s, target, i + 1, str)) return true;

        return false;
    }

    private static int canCompleteDP(String s1, String s2, int i, int j, int[][] dp) {
        if (i < 0 || j < 0) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        //match
        if (s1.charAt(i) == s2.charAt(j)) return dp[i][j] = 1 + canCompleteDP(s1, s2, i - 1, j - 1, dp);

        //not match
        return dp[i][j] = Math.max(canCompleteDP(s1, s2, i - 1, j, dp), canCompleteDP(s1, s2, i, j - 1, dp));

    }

    private static boolean isSorted(List<Integer> list) {
        for (int i = 0; i + 1 < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) return false;
        }
        return true;
    }
}
