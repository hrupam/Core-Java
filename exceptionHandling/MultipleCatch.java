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
public class MultipleCatch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int A[] = {1, 2};
        try {
            int result = A[2] + (a / b);
            System.out.println(result);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        finally{
            int sum=0;
            for(var x:A)
                sum+=x;
            System.out.println("Sum of array elements="+sum);
        }

    }
}
