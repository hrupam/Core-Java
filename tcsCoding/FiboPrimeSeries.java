/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcsCoding;

import java.util.Scanner;

/**
 *
 * @author hrupa
 */
class Generator {

    int n;
    int fibArray[];
    int primeArray[];
    int fibctr = 0;
    int primectr = 0;

    public Generator(int n) {
        this.n = n;
        this.primeArray = new int[n];
        this.fibArray = new int[n];
    }

    void fiboGenerator() {
        int a = 0;
        int b = 1;
        for (int i = 0; i < fibArray.length; i++) {
            if (i == 0) {
                this.fibArray[i] = a;
            } else if (i == 1) {
                this.fibArray[i] = b;
            } else {
                int c = a + b;
                this.fibArray[i] = c;
                a = b;
                b = c;
            }
        }

    }

    void primeGenerator() {
        int num = 0;

        for (int i = 0; i < n;) {
            int ctr = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    ctr++;
                }
            }

            if (ctr == 2) {
                this.primeArray[i] = num;
                i++;
            }
            num += 1;

        }

    }

    int getFibo() {
        return fibArray[fibctr++];
    }

    int getPrime() {
        return primeArray[primectr++];
    }
}

public class FiboPrimeSeries {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int n = sc.nextInt();
        Generator g = new Generator(n);
        g.fiboGenerator();
        g.primeGenerator();
        System.out.println("The required series:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(g.getPrime());
            } else {
                System.out.print(g.getFibo());
            }
            if(i!=n)
                System.out.print(", ");
        }

    }
}
