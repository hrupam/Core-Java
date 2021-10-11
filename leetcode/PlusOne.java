package leetcode;

import java.util.Arrays;

class PlusOne {
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] == 9) {
            int i = digits.length - 1;
            while (i >= 0 && digits[i] == 9) {
                digits[i] = 0;
                i--;
            }
            String str = "";
            if (i != -1) {
                digits[i] += 1;
                for (int x : digits)
                    str += x;
            } else if (i == -1) {
                for (int x : digits)
                    str += x;
                str = "1" + str;
            }
            int[] arr = new int[str.length()];
            for (int id = 0; id < str.length(); id++) {
                arr[id] = Integer.parseInt(String.valueOf(str.charAt(id)));

            }
            return arr;


        } else {
            digits[digits.length - 1] += 1;
            return digits;
        }

    }

    public static void main(String[] args) {
        int[] arr = {};
        int[] res = plusOne(arr);
        System.out.println(Arrays.toString(res));
    }
}