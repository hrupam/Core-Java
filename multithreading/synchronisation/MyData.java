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
public class MyData {
    synchronized void display(String str){
        for(int i=0;i<str.length();i++)
        System.out.println(str.charAt(i));
    }
}
