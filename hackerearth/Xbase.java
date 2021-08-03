package hackerearth;

import java.util.Scanner;


public class Xbase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t_i = 0; t_i < T; t_i++) {
            long n = sc.nextLong();
            int k = sc.nextInt();

            long out_ = solve(k, n);
            System.out.println(out_);
            System.out.println("");
        }
    }

    static String toXbase(long n, int k) {
        long t = n;
        String result = "";
        while (t != 0) {
            long d = t % k;
            result = d + result;
            t /= k;
        }
        return result;
    }

    static long solve(int k, long n) {
        // Write your code here
        long result = 0;
        for (int num = 0; num <= n; num++) {
            long length = toXbase(num, k).length();
            result += length;

        }
        return result + 1;
    }
}
