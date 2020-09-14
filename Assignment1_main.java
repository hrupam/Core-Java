/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */

public class Assignment1_main {
    public static void main(String args[]){
        Assignment1 ob=new Assignment1();
        ob.input();
        System.out.println("Addition is "+ob.addTwoNumbers());
        ob.evenOdd();
        System.out.println("Factorial is "+ob.factorial());
        ob.fibonacci();
    }    
}
