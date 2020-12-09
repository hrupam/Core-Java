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
public class MyData {
    private int value=0;
    private boolean flag=true;
    
    synchronized public void set(int v){
        while(flag!=true)
            try{wait();}catch(InterruptedException e){}
        value=v;
        flag=false;
        notify();
        
    }
    synchronized public int get(){
        while(flag!=false)
            try{wait();}catch(InterruptedException e){}
        
        flag=true;
        notify();
        return value;
    }
}
