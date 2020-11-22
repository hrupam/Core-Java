/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */
package thisKeyword;
import java.util.Scanner;
public class ThisFunction_Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int c=sc.nextInt();
        ThisFunction ob=new ThisFunction(c);
        ob.display();
    }
}
