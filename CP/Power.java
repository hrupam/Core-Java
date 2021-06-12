/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CP;

/**
 *
 * @author rupam
 */
public class Power {

    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else if ((b & 1) == 0) {
            return power(a * a, b / 2);
        } else {
            return a * power(a, b - 1);
        }
    }

    public static void main(String args[]) {
        System.out.println("Power = " + power(2, 5));
    }
}
