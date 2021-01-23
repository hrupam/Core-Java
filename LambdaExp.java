/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */
interface A {

    void show(int x);
}

public class LambdaExp {

    static void f1(A ob) {
        ob.show(5);
    }

    public static void main(String args[]) {
//        A ob = x -> System.out.print(x);
//        ob.show(5);
//        f1(x -> System.out.println(x));
        f1(new A() {
            @Override
            public void show(int x) {
                System.out.println(x);
            }
        });
    }
}
