package StringOps;

import java.util.Scanner;

public class RunLengthEncoding {
    public static String RLE(String s) {
        int i = 0;
        int j = 0;
        String result = "";
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
            result += count + String.valueOf(s.charAt(i));
            i = j;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to optimize -");
        String s = sc.nextLine().trim();
        System.out.print("Enter encoding count - ");
        int count = sc.nextInt();

        String encodedString = s;
        while (count-- != 0) {
            encodedString = RLE(encodedString);
        }

        System.out.println("RLE encoded - " + encodedString);

        int diff = s.length() - encodedString.length();
        if (diff > 0)
            System.out.println("Optimized " + diff + " characters");
        else if (diff < 0)
            System.out.println("Increased " + Math.abs(diff) + " characters");
        else
            System.out.println("Same");
    }
}
