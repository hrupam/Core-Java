/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */
package stack;
import stack.exception.*;
public class Stack {
    private final int size;
    private int top;
    private int A[];
    public Stack(int size){
        this.size=size;
        top=-1;
        A=new int[size];
    }
    public void push(int x)throws StackOverflowException
    {
        if(top+1==size)
            throw new StackOverflowException();
        else
        {
            A[++top]=x;
            System.out.println(x+" is pushed onto the stack");
        }  
    }
    public int pop()throws StackUnderflowException
    {
        if(top==-1)
            throw new StackUnderflowException();
        else
            return A[top--];
    }
}
