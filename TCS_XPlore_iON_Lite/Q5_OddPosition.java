package TCS_XPlore_iON_Lite;

import java.util.Scanner;

public class Q5_OddPosition {
    private static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            int t = i + 1;
            if (isOdd(t))
                res += s.charAt(i);
        }
        System.out.print(res);
    }
}
