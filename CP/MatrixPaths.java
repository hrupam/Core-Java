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
public class MatrixPaths {

    static int matrixPaths(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        }
        return matrixPaths(n - 1, m) + matrixPaths(n, m - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions-");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = matrixPaths(n, m);
        System.out.println("No. of possible paths = " + result);
    }
}
