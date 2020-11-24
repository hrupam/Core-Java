/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */
package staticBlock;
class Test{
    static{
        System.out.println("Block 1");
    }
    static{
        System.out.println("Block 2");
    }
}
public class StaticBlock {
    final int X;
    final static int Y;
    /*StaticBlock(){
        X=5;
    }*/
    {
        X=10;
    }
    static {
        Y=10;
        System.out.println("Y is initialised");
    }
    void display(){
        System.out.println(X+" "+Y);
    }
    public static void main(String args[]){
        StaticBlock sb=new StaticBlock();
        sb.display();
        Test t=new Test();
    }
}
