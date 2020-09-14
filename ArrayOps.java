/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */
import java.util.Scanner;
public class ArrayOps {
    int a[];
    public ArrayOps(int n){
        a=new int[n];
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
    }
    void sort(){
        for(int i=0;i<a.length;i++){
            int j=i-1;
            int k=a[i];
            while(j!=-1 && a[j]>k){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;
        }
    }
}
