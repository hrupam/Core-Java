/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */
import java.util.*;
public class Assignment1 {
    int a,b,n_evenodd,n_fact,n_fibo;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers for addition");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter a number to check even/odd");
        n_evenodd=sc.nextInt();
        System.out.println("Enter a number to find factorial");
        n_fact=sc.nextInt();
        System.out.println("Enter the range of fibonacci series");
        n_fibo=sc.nextInt();
    }
    int addTwoNumbers(){
        return a+b;
    }
    int factorial(){
        int f=1;
        for(int i=1;i<=n_fact;i++)
            f=f*i;
        return f;
    }
    void evenOdd(){
        if(n_evenodd%2==0)
            System.out.println(n_evenodd+" is even");
        else
            System.out.println(n_evenodd+" is odd");
    }
    void fibonacci(){
        int a=0,b=1;
        int c;
        System.out.print("Fibonacci series is ");
        System.out.print(a+","+b+",");
        for(int i=3;i<=n_fibo;i++){
            c=a+b;
            a=b;b=c;
            if(i!=n_fibo)
                System.out.print(c+",");
            else
                System.out.print(c);
        }
    }
}

