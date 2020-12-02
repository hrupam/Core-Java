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
public class MyThread extends Thread {
    @Override
    public void run(){
        int i=1;
        while(true){
            System.out.println(i++ +" Thread");
        }
    }
}
