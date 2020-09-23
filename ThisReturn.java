/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */

//Using this keyword to return the current class instance
public class ThisReturn {
    int a,b;
    public ThisReturn(){
        a=5;
        b=10;
    }
    ThisReturn get(){
        return this;
    }
    void display(){
        System.out.print("a="+a+"\nb="+b);
    }
}
