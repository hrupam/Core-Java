/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CP.helper;

/**
 * @author rupam
 */
public class Helper {

    public static String swap(String s, int i, int j) {
        char str[] = s.toCharArray();
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;

        return String.valueOf(str);
    }

    public static boolean isPalindrome(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;

        return isPalindrome(s, l + 1, r - 1);

    }
}
