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
public class MyThread1 extends Thread{
    MyData d;
    public MyThread1(MyData d){
        this.d=d;
    }
    @Override
    public void run(){
        d.display("Hello");
    }
        
}
