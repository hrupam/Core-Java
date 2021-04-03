/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfyTQ;

/**
 *
 * @author rupam
 */
import java.util.*;

public class RecursivePalindrome {

    static boolean isPalindrome(int n) {
        StringBuffer num = new StringBuffer(String.valueOf(n));
        StringBuffer rev = num.reverse();
        return num.equals(rev);
    }

    static int reverse(int n) {
        StringBuffer num = new StringBuffer(String.valueOf(n));
        StringBuffer rev = num.reverse();
        String rev2 = rev.toString();
        return (Integer.valueOf(rev2));
    }

    static int result(int n1, int n2) {
        if (isPalindrome(n1 + n2)) {
            return n1 + n2;
        } else {
            return result(n1 + n2, reverse(n1 + n2));
        }

    }

    public static void main(String[] args) throws java.lang.Exception {

        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        int num1 = Integer.parseInt(inputString);
        int num2 = reverse(num1);
        int result = result(num1, num2);
        System.out.println(result);

    }
}
