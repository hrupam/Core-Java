package DynamicProgramming;

import CP.helper.Helper;

public class LongestPalindromicSubsequence {

    public static int lps(String s) {
        // Write your code here.
        return LongestCommonSubsequence.lcs(s, Helper.reverse(s));
    }
}
