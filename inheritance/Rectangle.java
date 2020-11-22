/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */
package inheritance;
import java.util.Scanner;
public class Rectangle {
    int l,b,area;
    public Rectangle(){
        l=b=area=0;
    }
    public Rectangle(int l,int b){
        this();
        this.l=l;
        this.b=b;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        this.l=sc.nextInt();
        System.out.println("Enter breadth:");
        this.b=sc.nextInt();
    }
    void calcArea(){
        area=l*b;
    }
    void displayArea(){
        System.out.println("Area of Rectangle: "+area);
    }
}
