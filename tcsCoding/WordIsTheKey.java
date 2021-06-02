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
public class WordIsTheKey {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word-");
        String s = sc.next();
        int flag = 0;
        String keywords[] = {"break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"};
        for (String keyword : keywords) {
            if (s.equals(keyword)) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(s + " is a keyword");
        } else {
            System.out.println(s + "is not a keyword");
        }
    }
}
