/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */
package abstractClass;
public class Abstract_Main {
    public static void main(String args[]){
        AbstractClass ob=new ChildClass_Abstract();
        ob.display();
        ob.printStatus();
    }
}
