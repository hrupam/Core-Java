/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.valleymountcount;

/**
 *
 * @author hrupa
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Stack{
    int top=-1;
    char ar[]=new char[1000000];
    void push(char x){
        ar[++top]=x;
    }
    void pop(){
        if(top!=-1)
            top--;
    }
    boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }
    char top(){
        if(top==-1)
            return ' ';
        return ar[top];
    }
}

public class ValleyMountCount {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */
    private Stack stack=new Stack();
    private int valley_count=0; 
    private int mount_count=0;
    public void countingValleys(int steps, String path) {
    // Write your code here
        for(int i=0;i<steps;i++){
            char step=path.charAt(i);
            if(step=='D'){
                if(stack.top()=='U'){
                    stack.pop();
                    if(stack.isEmpty())
                        mount_count++;
                }

                else
                    stack.push(step);
            }
            else if(step=='U'){
                if(stack.top()=='D'){
                    stack.pop();
                    if(stack.isEmpty())
                        valley_count++;
                }
                else if(stack.top()==' ' || stack.top()=='U'){
                    stack.push(step);
                }
            }

        }
        }
    public int getMountCount(){
        return this.mount_count;
    }
    public int getValleyCount(){
        return this.valley_count;
    }
}
