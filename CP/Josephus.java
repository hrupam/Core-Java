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
public class Josephus {

    static int jos(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (jos(n - 1, k) + k) % n;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and k");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int winner = jos(n, k);
        System.out.println("Winner = " + winner);
    }
}
