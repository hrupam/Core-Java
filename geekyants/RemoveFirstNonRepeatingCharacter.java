package geekyants;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s1 = "passage";
        String s2 = "turtle";
        System.out.println(removeFirstNonRepeatingChar(s1));
        System.out.println(removeFirstNonRepeatingChar(s2));
    }

    private static String removeFirstNonRepeatingChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char nonRepeatingChar = Character.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                nonRepeatingChar = entry.getKey();
                break;
            }
        }

        return s.replace("" + nonRepeatingChar, "");
    }
}
