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
public class CaesarCipher {

    static String customCaesarCipher(int key, String message) {
        String result = "";
        char temp;
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (Character.isUpperCase(c)) {
                if (c + key > 90) {
                    temp = (char) (c + key - 26);
                    result += String.valueOf(temp);

                } else {
                    result += String.valueOf(((char) (c + key)));
                }

            } else if (Character.isLowerCase(c)) {
                if (c + key > 122) {
                    temp = (char) (c + key - 26);
                    result += String.valueOf(temp);

                } else {
                    result += String.valueOf(((char) (c + key)));
                }

            } else if (Character.isDigit(c)) {
                if (c + key > 57) {
                    temp = (char) (c + key - 10);
                    result += String.valueOf(temp);
                } else {
                    result += String.valueOf((char) ((int) c + key));
                }

            } else {

                result += String.valueOf(c);

            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        sc.nextLine();
        if (key < 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        System.out.println("Enter message:");
        String message = sc.nextLine();

        String result = customCaesarCipher(key, message);
        System.out.println("Result: " + result);
    }
}
