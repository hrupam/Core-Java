package StringOps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestPalindromeSubstring {

    public static List<String> getAllSubstrings(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                list.add(s.substring(i, j));
            }
        }
        return list;
    }

    public static boolean isPalin(String s, int l, int r) {
        if (l >= r)
            return true;
        else if (s.charAt(l) != s.charAt(r))
            return false;
        return isPalin(s, l + 1, r - 1);
    }

    public static void main(String[] args) {
        List<String> substrs = getAllSubstrings("forgeeksskeegfor");
        Collections.sort(substrs, Collections.reverseOrder((String s1, String s2) -> {
            if (s1.length() < s2.length())
                return -1;
            else if (s1.length() > s2.length())
                return 1;
            return 0;
        }));

        for (String str : substrs)
            if (isPalin(str, 0, str.length() - 1)) {
                System.out.println("Longest Palindrome: " + str);
                return;
            }
    }
}
