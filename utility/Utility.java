/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

/**
 *
 * @author rupam
 */
public class Utility {

    public static int[] removeDuplicates(int[] A) {
        int k = 0;
        int[] temp = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int flag = 0;
            for (int j = 0; j < temp.length; j++) {
                if (A[i] == temp[j]) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                temp[k++] = A[i];
            }
        }
        int updatedArray[] = new int[k];
        System.arraycopy(temp, 0, updatedArray, 0, k);
        return updatedArray;
    }

    public static String[] removeDuplicates(String[] A) {
        int k = 0;
        String[] temp = new String[A.length];
        for (int i = 0; i < A.length; i++) {
            int flag = 0;
            for (int j = 0; j < temp.length; j++) {
                if (A[i].equalsIgnoreCase(temp[j])) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                temp[k++] = A[i];
            }
        }
        String updatedArray[] = new String[k];
        System.arraycopy(temp, 0, updatedArray, 0, k);
        return updatedArray;
    }

    public static char[] removeDuplicates(char[] A) {
        int k = 0;
        char[] temp = new char[A.length];
        for (int i = 0; i < A.length; i++) {
            int flag = 0;
            for (int j = 0; j < temp.length; j++) {
                if (A[i] == temp[j]) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                temp[k++] = A[i];
            }
        }
        char updatedArray[] = new char[k];
        System.arraycopy(temp, 0, updatedArray, 0, k);
        return updatedArray;
    }

}
