/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcsCoding;

import java.util.Scanner;

/**
 * @author rupam
 */
public class OddlyEven {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if (((i + 1) & 1) == 0) {
                evenSum += Integer.parseInt(c);

            } else {
                oddSum += Integer.parseInt(c);
            }
        }
        int result = Math.abs(evenSum - oddSum);
        System.out.println("Result = " + result);
    }
}
