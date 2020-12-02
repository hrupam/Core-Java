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
public class DaemonThreadTest {
    public static void main(String args[]){
        MyThread t=new MyThread();
        t.setDaemon(true);
        t.start();
        
        Thread m=Thread.currentThread();
        try{
            m.join();
        }
        catch(InterruptedException e){};
    }
}
