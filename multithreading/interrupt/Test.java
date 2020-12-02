/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.interrupt;

/**
 *
 * @author hrupa
 */
public class Test {
    public static void main(String args[]){
        MyThread t=new MyThread("Thread 1");
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        t.interrupt();
        System.out.println("ID- "+t.getId());
        System.out.println("Name- "+t.getName());
        System.out.println("Priority- "+t.getPriority());
        System.out.println("State- "+t.getState());
        System.out.println("Alive- "+t.isAlive());
    }
}
