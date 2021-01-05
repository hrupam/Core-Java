/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.valleymountcount;

import java.util.Scanner;

/**
 *
 * @author hrupa
 */
public class Test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter path: ");
        String path=sc.next();
        path=path.toUpperCase();
        int steps=path.length();
        ValleyMountCount ob=new ValleyMountCount();
        ob.countingValleys(steps, path);
        System.out.println("Mountains count: "+ob.getMountCount());
        System.out.println("Valleys count: "+ob.getValleyCount());
    }
}

