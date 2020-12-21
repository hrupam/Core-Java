/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outerinnerclass;

/**
 *
 * @author hrupa
 */

class Outer{
    public class Inner{
        void display(){
            System.out.println("Hello");
        }
    }
}

public class Demo {
    public static void main(String args[]){
        
        /** to call display method**/
        
        //Outer.Inner.display(); // for static inner class and static display()
        
        //Outer.Inner ob=new Outer.Inner(); //for static inner class only
        
        //Outer.Inner ob=new Outer().new Inner(); //for all non-static
        
        
    }
}
