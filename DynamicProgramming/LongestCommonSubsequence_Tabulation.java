package DynamicProgramming;

public class LongestCommonSubsequence_Tabulation {

    public static void main(String[] args) {
        String s = "acdfgr";
        String t = "amfiur";

        System.out.println(getLCSString(s, t));
    }

    public static int lcs(String s, String t) {
        //Your code goes here
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int j = 0; j <= m; j++) dp[0][j] = 0;
        for (int i = 0; i <= n; i++) dp[i][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                //match
                if (s.charAt(i - 1) == t.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];

                    //not match
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[n][m];
    }

    public static String getLCSString(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int j = 0; j <= m; j++) dp[0][j] = 0;
        for (int i = 0; i <= n; i++) dp[i][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                //match
                if (s.charAt(i - 1) == t.charAt(j - 1)) dp[i][j] = 1 + dp[i - 1][j - 1];

                    //not match
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }


        int i = n;
        int j = m;
        String str = "";
        while (i > 0 && j > 0) {
            //match
            if (s.charAt(i - 1) == t.charAt(j - 1)) {
                str = s.charAt(i - 1) + str;
                i = i - 1;
                j = j - 1;
            }
            //not match
            else {
                if (dp[i - 1][j] > dp[i][j - 1]) i = i - 1;
                else j = j - 1;
            }
        }

        return str;
    }
}
