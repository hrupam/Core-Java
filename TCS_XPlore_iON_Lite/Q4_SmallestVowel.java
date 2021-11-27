package TCS_XPlore_iON_Lite;

import java.util.Scanner;

public class Q4_SmallestVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        char smallestVowel = 'u';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') && c < smallestVowel) smallestVowel = c;
        }
        System.out.print(smallestVowel);

    }
}
