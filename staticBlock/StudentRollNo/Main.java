/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticBlock.StudentRollNo;

import java.util.Scanner;

/**
 *
 * @author hrupa
 */
public class Main {
    public static void main(String args[]){
        System.out.println("Enter no. of students: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Student s[]=new Student[n];
        
        for(Student student:s){
            student=new Student();
            student.displayRollNo();
        }
    }
}
