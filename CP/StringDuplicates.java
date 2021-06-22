/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CP;

import java.util.*;

/**
 * @author rupam
 */
public class StringDuplicates {

    public static void getFrequency(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hmap.containsKey(c)) {
                hmap.put(c, hmap.get(c) + 1);
            } else {
                hmap.put(c, 1);
            }
        }

//        ITERATING THROUGH MAP
        /*        
        for (Map.Entry entry : hmap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
         */

 /*
        Iterator iter = hmap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
         */
        hmap.forEach((k, v) -> System.out.println(k + " : " + hmap.get(k)));
    }

    public static String removeDuplicates(String s) {
        String str = "";
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        for (Iterator<Character> i = set.iterator(); i.hasNext(); ) {
            str += i.next();
        }

        return str;
    }

    public static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) < 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    //WITHOUT USING COLLECTION
    /*
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length()) {
            return false;
        }
        int h[] = new int[26];
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            h[(int) c - 97] += 1;
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            h[(int) c - 97] -= 1;
            if (h[(int) c - 97] < 0) {
                return false;
            }
        }
        return true;

    }
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().trim();

        System.out.println(removeDuplicates(s));

        System.out.println(isAnagram("dormitory", "dirtyroom"));
    }
}
