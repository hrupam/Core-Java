package leetcode;

import java.util.Arrays;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = {"", "M", "MM", "MMM"};

        return thousands[num / 1000] +
                hundreds[(num % 1000) / 100] +
                tens[(num % 100) / 10] +
                ones[num % 10];
    }

    public static void main(String[] args) {
        int[] arr = {13, 4, 96, 399, 10, 1004};
        Arrays.sort(arr);
        for (int num : arr)
            System.out.println(num + " -> " + intToRoman(num));
    }
}
