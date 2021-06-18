/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 * @author rupam
 */
public class QuickSort {

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(int a[], int l, int h) {
        int pivot = l;
        int i = l;
        int j = h;
        while (i < j) {
            do {
                i++;
            } while (a[i] <= a[pivot]);
            do {
                j--;
            } while (a[j] > a[pivot]);
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, j, pivot);
        return j;

    }

    static void quickSort(int a[], int low, int high) {
        if (low < high) {
            int pos = partition(a, low, high);
            quickSort(a, low, pos);
            quickSort(a, pos + 1, high);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array length: ");
        int n = sc.nextInt();
        n += 1;
        int a[] = new int[n];
        a[n - 1] = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
//            a[i] = sc.nextInt();
            a[i] = (int) (Math.random() * 100);
        }

        quickSort(a, 0, n - 1);
        for (int i = 0; i < n - 1; i++)
            System.out.print(a[i] + " ");
    }

}
