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
public class Consumer extends Thread {
    MyData d;
    public Consumer(MyData d){
        this.d=d;
    }
    @Override
    public void run(){
        int value;
        while(true){
            value=d.get();
            System.out.println("Consumed: "+value);
        }
    }
}
