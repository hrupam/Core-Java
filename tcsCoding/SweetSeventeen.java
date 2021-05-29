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
public class SweetSeventeen {

    public static void main(String args[]) {
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base17 number-");
        String s = sc.nextLine();
        s = s.toUpperCase();
        int length = s.length();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = Integer.parseInt(String.valueOf(c));
                sum += num * (long) Math.pow(17, --length);
            } else if (c >= 'A' && c <= 'G') {
                int num = (c - 'A') + 10;
                sum += num * (long) Math.pow(17, --length);
            }
        }
        System.out.println("Decimal value: " + sum);
    }
}
