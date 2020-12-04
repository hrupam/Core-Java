/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.synchronisation;

/**
 *
 * @author hrupa
 */
public class Test {
    public static void main(String args[]){
        MyData data=new MyData();
        MyThread1 t1=new MyThread1(data);
        MyThread2 t2=new MyThread2(data);
        t1.start();
        t2.start();
    }
}
