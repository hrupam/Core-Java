/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hrupa
 */
package staticBlock.StudentRollNo;
import java.util.*;
public class Student {
    private final String rollno;
    private static int rollCount;
    static {
        rollCount=0;
    }
    private String generateRollNo(){
        Date d=new Date();
        String rno="BGI-"+(d.getYear()+1900)+"-"+(++rollCount);
        return rno;
    }
    public Student(){
        this.rollno=generateRollNo();
    }
    public void displayRollNo(){
        System.out.println(this.rollno);
    }
}
