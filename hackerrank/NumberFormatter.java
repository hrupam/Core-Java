/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author hrupa
 */
import java.text.*;
import java.util.*;

public class NumberFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat in = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Write your code here.
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + in.format(payment));
        System.out.println("China: " + ch.format(payment));
        System.out.println("France: " + fr.format(payment));
    }
}
