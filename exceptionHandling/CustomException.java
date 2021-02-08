/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionHandling;

import java.util.*;

/**
 *
 * @author hrupa
 */
class NegativeDimensionException extends Exception {

    @Override
    public String toString() {
        return "Dimensions can't be negative";
    }
}

public class CustomException {

    static int area(int l, int b) throws NegativeDimensionException {
        if (l < 0 || b < 0) {
            throw new NegativeDimensionException();
        }
        return l * b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        try {
            int area = area(l, b);
            System.out.println("Area= " + area);
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }
    }
}
