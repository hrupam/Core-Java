/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

@SuppressWarnings("unchecked")
/**
 *
 * @author hrupa
 */

class MyArray<T extends Number> {

    private final T A[];
    private int length = 0;

    public MyArray(int n) {
        this.A = (T[]) new Object[n];
    }

    public void append(T value) {
        A[length++] = value;
    }

    public void display() {
        for (int i = 0; i < A.length; i++) {
            if (i == A.length - 1) {
                System.out.print(A[i]);
            } else {
                System.out.print(A[i] + ", ");
            }
        }

    }
}

public class GenericClass {

    public static void main(String args[]) {
        MyArray<Integer> m = new MyArray<>(3);
        m.append(50);
        m.append(10);
        m.append(20);
        m.display();
    }
}
