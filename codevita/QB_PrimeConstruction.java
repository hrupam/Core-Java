package codevita;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QB_PrimeConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String[] input = sc.nextLine().trim().split(" ");
        for (String x : input) list.add(Integer.parseInt(x));

        int q = Collections.min(list);
        list.remove((Object) q);


        int lcm = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            lcm = lcm(lcm, list.get(i));
        }

        int p = lcm + q;
        if (isPrime(p)) System.out.print(p);
        else System.out.println("None");


    }

    private static int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    static boolean isPrime(int n) {
        int l = (int) Math.sqrt(n);
        for (int i = 2; i <= l; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
