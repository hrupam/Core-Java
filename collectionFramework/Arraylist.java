/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionFramework;

import java.util.*;

/**
 *
 * @author hrupa
 */
public class Arraylist {

    public static void main(String args[]) {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }

        /* System.out.println("The elements are: ");
        A.forEach(element -> System.out.println(element)); */
        System.out.println("Unsorted Array: " + A);
        Collections.sort(A);
        System.out.println("Sorted Array: " + A);
    }
}
