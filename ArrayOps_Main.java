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
public class ArrayOps_Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        ArrayOps ob=new ArrayOps(n);
        ob.input();
        ob.sort();
        System.out.println("Sorted array is");
        for(int element:ob.a)
            System.out.print(element+" ");
    }
}
