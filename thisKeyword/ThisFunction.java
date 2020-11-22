/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */
package thisKeyword;
public class ThisFunction {
    int a,b,c;
    public ThisFunction(){
        a=b=c=0;
    }
    public ThisFunction(int c){
        this();
        this.c=c;
    }
    void display(){
        System.out.print("a="+a+"\nb="+b+"\nc="+c);
    }
}
