package InfyTQ;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MinimumBase {

    private static String getBaseNumber(int n, int base) {
        String res = "";
        while (n != 0) {
            int r = n % base;
            n = n / base;
            res = r + res;
        }
        return res;
    }

    private static boolean isUnique(String k) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < k.length(); i++)
            set.add(k.charAt(i));

        return set.size() == 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = 2;
        while (true) {
            String k = getBaseNumber(n, base);
            if (isUnique(k)) {
                System.out.println(base);
                break;
            }
            base++;
        }
    }
}
