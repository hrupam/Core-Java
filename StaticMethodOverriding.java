/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */
class A {

    static void meth() {
        System.out.println("Meth");
    }
}

public class StaticMethodOverriding extends A {

    public static void main(String args[]) {
        StaticMethodOverriding ob = new StaticMethodOverriding();
        ob.meth();
    }

}
