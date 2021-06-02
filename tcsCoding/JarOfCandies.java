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
public class JarOfCandies {

    public static void main(String args[]) {
        int n = 10, k = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of candies customer is ordering-");
        int req = sc.nextInt();
        if (req > k) {
            System.out.println("INVALID INPUT");
        } else {
            int sold = req;
            int candiesLeft = k - req;

            if (candiesLeft < k) {
                candiesLeft = k + candiesLeft;
            }

            System.out.println("Number of candies sold: " + sold);
            System.out.println("Number of cadies available: " + candiesLeft);
        }
    }
}
