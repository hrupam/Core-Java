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
public class Permutation {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        permute(s, 0, s.length() - 1);
    }

    static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = Helper.swap(str, l, i);
                permute(str, l + 1, r);
                str = Helper.swap(str, l, i);

            }
        }
    }

}
