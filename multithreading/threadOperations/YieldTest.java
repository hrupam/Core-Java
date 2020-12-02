/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.threadOperations;

/**
 *
 * @author hrupa
 */
public class YieldTest {
    public static void main(String args[]){
        MyThread t=new MyThread();
        //t.setPriority(Thread.MAX_PRIORITY);
        
        //Thread m=Thread.currentThread();
        //m.setPriority(Thread.MIN_PRIORITY);
        
        t.start();
        
        int i=1;
        while(true){
            System.out.println(i++ +" Main");
            Thread.yield();
        }
    }
}
