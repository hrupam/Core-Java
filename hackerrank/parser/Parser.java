/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.parser;

/**
 *
 * @author hrupa
 */
public class Parser {
    
    //IINER CLASS
    static private class Stack{
        int top=-1;
        char A[]=new char[100];
        
        void push(char s){
        A[++top]=s;
        }
        
        char pop(){
            if(top==-1)
                return ' ';
            return A[top--];
        }
    }
    
    public boolean isBalanced(String s){
        
        //Stack st=new Stack();
        /* OR *****/
        Parser.Stack st=new Parser.Stack();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{')
                st.push(c); 
            else if(c==')' || c=='}')
            {
                char poppedItem=st.pop();
                if(poppedItem=='(' && c==')' || poppedItem=='{' && c=='}')
                    continue;
                else
                    return false;
            }
        }
        if(st.top==-1)
            return true;
        return false;
    }
}
