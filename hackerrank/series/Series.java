/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.series;

import java.util.*;

/**
 *
 * @author hrupa
 */
public class Series {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = 0;
            ArrayList<Integer> A = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    sum = a + ((int) Math.pow(2, j) * b);
                    A.add(sum);
                } else {
                    //sum=(int)Math.pow(2,j)*b;
                    sum = A.get(j - 1) + ((int) Math.pow(2, j) * b);
                    A.add(sum);
                }
            }
            A.forEach(x -> System.out.print(x + " "));
            System.out.println();
        }
        in.close();
    }
}
