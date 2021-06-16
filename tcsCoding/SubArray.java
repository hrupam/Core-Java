/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcsCoding;

import java.util.*;

/**
 *
 * @author rupam
 */
public class SubArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //size of array
        int a[] = new int[num]; //the array
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }

        int num2 = sc.nextInt(); //to be searched
        int S = sc.nextInt(); //size of subset

        for (int i = 0; i < num; i += S) {
            boolean flag = false;

            for (int j = i; j < i + S; j++) {

                if (a[j] == num2) {
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println(0);
                return;
            }

        }
        System.out.println(1);
    }
}
