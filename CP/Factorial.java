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
public class Factorial {

    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int trailingZeroInFactorial(int n) {
        int result = 0;
        for (int i = 5; i <= n; i = i * 5) {
            result += n / i;
        }
        return result;
    }

    public static void main(String args[]) {
        int n = new Scanner(System.in).nextInt();
        System.out.println("Factorial = " + factorial(n));
        System.out.println("Trailing zeros in factorial = " + trailingZeroInFactorial(n));
    }
}
