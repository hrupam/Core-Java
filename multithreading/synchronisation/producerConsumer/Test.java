/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.synchronisation.producerConsumer;

/**
 *
 * @author hrupa
 */
public class Test {
    public static void main(String args[]){
        MyData d=new MyData();
        Producer p=new Producer(d);
        Consumer c=new Consumer(d);
        p.start();
        c.start();
    }
}
