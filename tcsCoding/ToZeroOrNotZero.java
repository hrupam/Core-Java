/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcsCoding;

import java.util.Scanner;

/**
 *
 * @author rupam
 */
public class ToZeroOrNotZero {

    static String modifyDigit(int n, int length) {

        int zeroCount = length - (String.valueOf(n).length());
        String digit = "";
        while (zeroCount-- != 0) {
            digit += 0;
        }
        digit += n;

        return digit;

    }

    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int length = String.valueOf(n).length();
        for (int i = m; i <= n; i++) {
            String digit = modifyDigit(i, length);
            System.out.print(digit + " ");
        }
    }
}
