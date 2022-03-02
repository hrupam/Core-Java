package tcsCoding;

import CP.helper.Helper;

import java.util.HashMap;
import java.util.Map;

public class PalindromicArrangement {
    public static void main(String[] args) {
//        System.out.println(canPalindrome("rearcac", 0));
        System.out.println(canPalindrome("rearcac"));
    }


    //Brute Force
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

    //Optimised
    private static boolean canPalindrome(String s) {
        char[] str = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char x : str)
            map.put(x, map.getOrDefault(x, 0) + 1);

        int oddCount = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet())
            if (entry.getValue() % 2 != 0) oddCount++;

        if (oddCount > 1) return false;
        return true;


    }


}
