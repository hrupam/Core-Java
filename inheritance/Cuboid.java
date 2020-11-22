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
public class Cuboid extends Rectangle {
    int h,vol;
    public Cuboid(){
        super();
        h=vol=0;
    }
    public Cuboid(int l,int b,int h){
        super(l,b);
        this.h=h;
        vol=0;
    }
    void input(){
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height:");
        this.h=sc.nextInt();
    }
    void calcVol(){
        vol=l*b*h;
    }
    void displayVol(){
        System.out.println("Volume of Cuboid: "+vol);
    }
}
