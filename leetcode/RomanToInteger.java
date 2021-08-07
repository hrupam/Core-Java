package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String arr[] = {"IV", "VIII", "IX", "XII", "MCMXCIV", "I", "MMMCMXCIX"};
        Arrays.sort(arr, (s1, s2) -> {
            if (s1.length() < s2.length())
                return -1;
            else if (s1.length() > s2.length())
                return 1;
            else
                return s1.compareTo(s2);
        });
        for (String str : arr)
            System.out.println(str + " -> " + romanToInt(str));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); ) {
            if (i == s.length() - 1) {
                result += map.get(s.charAt(i));
                i++;
            } else if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                int temp = map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                result += temp;
                i += 2;
            } else {
                result += map.get(s.charAt(i));
                i++;
            }
        }
        return result;
    }
}
