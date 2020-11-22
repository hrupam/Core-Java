/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */
package constructor;
public class RectangleArea {
    int l,b;
    public RectangleArea(int l, int b){
        this.l=l;
        this.b=b;
    }
    int area(){
        return l*b;
    }
}
