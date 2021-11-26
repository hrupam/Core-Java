package TCS_XPlore_iON_Lite;

import java.util.Scanner;

public class Q3_Consonants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                    System.out.print(c);
            }
        }
    }
}