/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */

//Using this as method parameter
public class ThisParam {
    int a,b;
    public ThisParam(){
        a=3;
        b=9;
    }
    void display(ThisParam obj){
        System.out.print("a="+obj.a+"\nb="+obj.b);
    }
    void get(){
        display(this);
    }
}
