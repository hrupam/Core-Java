/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CP;

import CP.helper.Helper;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author rupam
 */
public class Permutation {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
//        permute(s, 0, s.length() - 1);

        List<String> perms = new LinkedList<>();
        permutation(s, 0, perms);
        System.out.println(perms);
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

    static void permutation(String s, int l, List<String> list) {
        if (l == s.length()) {
            list.add(s);
            return;
        }

        for (int i = l; i < s.length(); i++) {
            s = Helper.swap(s, l, i);
            permutation(s, l + 1, list);
            s = Helper.swap(s, l, i);
        }
    }

}
