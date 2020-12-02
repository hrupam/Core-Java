/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author hrupa
 */
public class Test {
    public static void main(String args[]){
        MyThread t=new MyThread();
        t.start();
        int i=1;
        while(true){
            System.out.println(i+" World");
            i++;
        }
    }
}
