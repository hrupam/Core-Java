/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.exception;

/**
 *
 * @author hrupa
 */
public class StackUnderflowException extends Exception {
    @Override
    public String toString(){
        return "Stack is empty";
    }
}
