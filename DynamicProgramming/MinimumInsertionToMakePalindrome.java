package DynamicProgramming;

public class MinimumInsertionToMakePalindrome {
    public static int minInsertion(String str) {
        // Write your code here.
        return str.length() - LongestPalindromicSubsequence.lps(str);
    }
}
