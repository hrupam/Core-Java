/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CP;

import java.util.Scanner;

/**
 *
 * @author rupam
 */
public class Powerset {

    static void powerSet(String s, int i, String currStr) {
        if (i == s.length()) {
            System.out.println(currStr);
        } else {
            powerSet(s, i + 1, currStr + s.charAt(i));
            powerSet(s, i + 1, currStr);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        powerSet(s, 0, "");
    }
}
