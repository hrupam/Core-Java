package leetcode;

import java.util.Scanner;

public class MaxPower {
    public static int maxPower(String s) {
        int maxCount = 0;
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            int count = 0;
            while (j < s.length()) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    j++;
                } else {
                    break;
                }
            }
            maxCount = Math.max(count, maxCount);
            i = j;
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int maxCount = maxPower(s);
        System.out.println(maxCount);
    }
}
