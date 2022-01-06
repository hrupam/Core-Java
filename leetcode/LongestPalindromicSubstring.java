package leetcode;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String subStr = new LongestPalindromicSubstring().longestPalindrome("babad");
        System.out.println(subStr);
    }

    public String longestPalindrome(String s) {
        int len = s.length();
        int startIndex = 0;

        int[][] dp = new int[len][len];

        int maxLen = 1;
        for (int i = 0; i < len; i++)
            dp[i][i] = 1;


        for (int i = 0; i + 1 < len; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                maxLen = 2;
                startIndex = i;
                dp[i][i + 1] = 1;
            }
        }

        for (int k = 3; k <= len; k++) {
            for (int i = 0; i + k - 1 < len; i++) {
                int j = i + k - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 1) {
                    dp[i][j] = 1;
                    maxLen = k;
                    startIndex = i;
                }
            }
        }
        return s.substring(startIndex, startIndex + maxLen);
    }


}
