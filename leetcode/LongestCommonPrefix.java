package leetcode;

public class LongestCommonPrefix {
    public static String commonPrefix(String s1, String s2) {
        String result = "";
        for (int i = 0, j = 0; i < s1.length() && j < s2.length(); i++, j++) {
            if (s1.charAt(i) == s2.charAt(j))
                result += s1.charAt(i);
            else
                break;

        }
        return result;
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String temp = strs[0];
        for (int i = 1; i < strs.length; i++)
            temp = commonPrefix(temp, strs[i]);
        return temp;
    }

    public static void main(String[] args) {
        String[] strs = {"rupam", "rupa", "rup"};
        System.out.println(longestCommonPrefix(strs));
    }
}
