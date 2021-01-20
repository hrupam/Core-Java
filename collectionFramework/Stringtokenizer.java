/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionFramework;

import java.io.*;
import java.util.*;

/**
 *
 * @author hrupa
 */
public class Stringtokenizer {

    public static void main(String args[]) throws Exception {
        byte[] b;
        try ( FileInputStream fis = new FileInputStream("C:\\Users\\hrupa\\Documents\\NetBeansProjects\\project1\\src\\main\\java\\collectionFramework\\data.txt")) {
            b = new byte[fis.available()];
            fis.read(b);
        }
        String s = new String(b);
        ArrayList<Integer> al = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s, ", \n");
        while (st.hasMoreTokens()) {
            try {
                al.add(Integer.parseInt(st.nextToken()));
            } catch (NumberFormatException e) {
            }
        }
        System.out.print(al);
    }
}
