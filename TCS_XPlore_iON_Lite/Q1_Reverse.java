package TCS_XPlore_iON_Lite;

import java.util.Scanner;

public class Q1_Reverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String n = sc.next();

            StringBuffer sb = new StringBuffer(n);
            sb.reverse();
            int res = Integer.parseInt(sb.toString());
            System.out.print("Reverse of the number is " + res);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}

