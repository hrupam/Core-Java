package tcsCoding;

import java.util.Arrays;

public class VowelShifter {
    public static void main(String[] args) {
        String s = "aYUiEcO";
        System.out.println(shift(s));
    }

    private static String shift(String s) {
        char[] str = s.toCharArray();
        char[] cap = {'A', 'E', 'I', 'O', 'U'};
        char[] small = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < str.length; i++) {
            char c = str[i];
            if (isVowel(c)) {
                if (Character.isUpperCase(c))
                    str[i] = cap[(Arrays.binarySearch(cap, c) + 1) % 5];

                else
                    str[i] = small[(Arrays.binarySearch(small, c) + 1) % 5];

            }
        }
        return String.valueOf(str);

    }

    private static boolean isVowel(char c) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char x : vowels) if (x == Character.toLowerCase(c)) return true;
        return false;
    }
}
