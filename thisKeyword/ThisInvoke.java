/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */

//Using this to invoke current class method
package thisKeyword;
public class ThisInvoke {
    void show(){
        System.out.print("Hello World");
    }
    void display(){
        this.show();
    }
}
