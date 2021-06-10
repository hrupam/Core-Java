/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CP;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rupam
 */
public class SieveOfEratosthenes {

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean isPrime[] = new boolean[n + 1];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result[] = sieveOfEratosthenes(n);
        for (int i = 1; i < result.length; i++) {
            if (result[i]) {
                System.out.println(i);
            }
        }
    }
}
