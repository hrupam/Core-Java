/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */

//Using this as an argument in the constructor call
package thisKeyword;
public class ThisArgument {
    A obj;
    public ThisArgument(A obj){
        this.obj=obj;
        obj.display(); //invoking method of class A
    }
}
class A {
    int x=5;
    public A(){
        ThisArgument ob=new ThisArgument(this);
    }
    void display(){
        System.out.print("x="+x);
    }
}
