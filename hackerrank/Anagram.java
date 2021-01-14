/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author hrupa
 */
import java.util.Scanner;

public class Anagram {

    static int count(char c, String s) {
        int ctr = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                ctr++;
            }
        }
        return ctr;
    }

    static boolean isAnagram(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();
        // Complete the function
        String distinct = "";
        /* for finding distinct characters */

        //in string a
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            int k = 0;
            for (int j = 0; j < distinct.length(); j++) {
                if (c == distinct.charAt(j)) {
                    k = 1;
                }
            }
            if (k == 0) {
                distinct += c;
            }
        }

        //in string b
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            int k = 0;
            for (int j = 0; j < distinct.length(); j++) {
                if (c == distinct.charAt(j)) {
                    k = 1;
                }
            }
            if (k == 0) {
                distinct += c;
            }
        }
        for (int i = 0; i < distinct.length(); i++) {
            if (count(distinct.charAt(i), a) == count(distinct.charAt(i), b)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
