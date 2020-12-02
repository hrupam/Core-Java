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
public class MyThread extends Thread {
    public MyThread(String name){
        super(name);
        //setPriority(Thread.MAX_PRIORITY);
    }
    @Override
    public void run(){
        int i=1;
        while(true){
            System.out.println(i++);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
