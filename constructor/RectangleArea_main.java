/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */
package constructor;
import java.util.Scanner;
public class RectangleArea_main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length: ");
        int l=sc.nextInt();
        System.out.println("Enter breadth: ");
        int b=sc.nextInt();
        RectangleArea ob=new RectangleArea(l,b);
        int rectArea=ob.area();
        System.out.println("Area is "+rectArea);
    }
}
