package StringOps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        boolean flag = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                flag = true;
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
        if (!flag)
            System.out.println("No duplicates");

    }
}
