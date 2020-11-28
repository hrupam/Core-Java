/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import stack.exception.*;
import java.util.Scanner;

/**
 *
 * @author hrupa
 */
public class Test {
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of stack:");
        int size=sc.nextInt();
        Stack st=new Stack(size);
        try{
            st.push(5);
            st.push(2);
            st.push(9);
            //st.push(1);
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
        }
        catch(StackOverflowException | StackUnderflowException e){
            System.out.println(e);
        }
        finally{
            sc.close();
        }
    }
}
