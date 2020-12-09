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
public class Producer extends Thread {
    MyData d;
    public Producer(MyData d){
        this.d=d;
    }
    @Override
    public void run(){
        int count=0;
        while(true){
            d.set(count);
            System.out.println("Produced: "+count);
            count++;
        }
    }
}
