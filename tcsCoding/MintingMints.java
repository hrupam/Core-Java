/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcsCoding;

import java.util.Scanner;

/**
 *
 * @author rupam
 */
public class MintingMints {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //first kid has
        int len = sc.nextInt(); //number of kids
        int sum = n;
        int temp;
        len -= 1;
        while (len-- != 0) {
            temp = sum - 1;
            sum += temp;
        }
        System.out.println(sum);
    }
}
