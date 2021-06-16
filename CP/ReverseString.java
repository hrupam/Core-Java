/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CP;

import CP.helper.Helper;
import java.util.Scanner;

/**
 *
 * @author rupam
 */
public class ReverseString {

    static String reverse(String s, int l, int r) {
        if (l >= r) {
            return s;
        } else {
            s = Helper.swap(s, l, r);
            return reverse(s, l + 1, r - 1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev = reverse(s, 0, s.length() - 1);
        System.out.println(rev);
    }
}
