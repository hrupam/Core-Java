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
public class ConsPrimeSum {

    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isSumOfPrimeFactors(int n) {
        int sum = 2;
        for (int i = 3; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
                if (sum == n) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ctr = 0;
        for (int i = 3; i <= N; i++) {
            if (isPrime(i)) {
                if (isSumOfPrimeFactors(i)) {
                    System.out.println(i);
                    ctr++;
                }
            }

        }
        System.out.println(ctr);
    }
}
