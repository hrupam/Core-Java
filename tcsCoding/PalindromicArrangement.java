package tcsCoding;

import CP.helper.Helper;

public class PalindromicArrangement {
    public static void main(String[] args) {
        System.out.println(canPalindrome("rearcac", 0));
    }


    private static boolean canPalindrome(String s, int i) {
        if (i == s.length()) {
            if (Helper.isPalindrome(s, 0, s.length() - 1)) return true;
            return false;
        }


        for (int l = i; l < s.length(); l++) {
            s = Helper.swap(s, l, i);
            if (canPalindrome(s, i + 1)) return true;
            s = Helper.swap(s, i, l);
        }

        return false;
    }


}
