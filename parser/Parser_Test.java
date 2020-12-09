/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import java.util.Scanner;

/**
 *
 * @author hrupa
 */
public class Parser_Test {
    public static void main(String args[]){
        
        Parser pr=new Parser();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.next();
        boolean isParsed=pr.isBalanced(s);
        if(isParsed)
            System.out.println(s+" is parsed");
        else
            System.out.println(s+" is not parsed");
    }
}
